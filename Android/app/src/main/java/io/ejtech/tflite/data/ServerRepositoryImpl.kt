package io.ejtech.tflite.data

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import androidx.compose.runtime.mutableStateOf
import io.ejtech.tflite.data.Commands.createCategoriesForExtraRepairs
import io.ejtech.tflite.ui.detection.Resource
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.DataOutputStream
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import java.net.Socket
import java.nio.ByteBuffer

class ServerRepositoryImpl() : ServerRepository {
    private var server: Socket? = null
    private lateinit var output: DataOutputStream
    private lateinit var input: InputStream

    private var _serverDataState = mutableStateOf(RepairViewState())

    @Volatile
    var throwException = false //used in screens other than repairvewscreen to detect disconnections and send user back to qrcodescanner screen

    override suspend fun connectToServer(ip: String, port: Int): Flow<Resource<String>> {
        throwException = false
        return flow {
            while(true){
                emit(Resource.Loading())
                delay(1000)  // added delay, seems to help with reconnects not failing, black screens
                try {
                    server = Socket(ip, port)
                    emit(Resource.Success("Connected to server"))
                    output = DataOutputStream(server?.getOutputStream())
                    input = server!!.getInputStream()
                    break
                } /*catch (e: UnknownHostException) {
                    e.message?.let { emit(Resource.Error(message = it)) }
                } catch (e: IOException) {
                    e.message?.let { emit(Resource.Error(message = it)) }
                }*/ catch (e: Exception) {
                    e.message?.let { emit(Resource.Error(message = it)) }
                    _serverDataState.value = RepairViewState()
                }
            }
        }
    }

    override suspend fun listen(): Flow<Resource<RepairViewState>> {
        throwException = false
        delay(1000) // added delay, seems to help with reconnects not failing, black screens
        return flow {
            var msg = ""
            var negativeOneCount = 0
            while (true) {
                // Don't consume anymore data when the msg is Server Restart. Allow return to QRCode screen navigation
                if(msg == "Server Restart") break
                msg = ""
                while (true) {
                    try {
                        val num = input.read()
                        if (num == -1) {
                            //Protective measure
                            //-1 accumulates if we think we're connected to the server when we are actually not
                            negativeOneCount += 1
                            if (negativeOneCount > 30) {
                                negativeOneCount = 0
                                throwException = true
                                emit(Resource.Error(message = "Lost connection to server"))
                            } else {
                                break //skip and read the next character
                            }
                        }
                        val ch = num.toChar()
                        msg += ch
                        if ( //These messages are sent as is from the server
                            msg == "Screen" ||
                            msg.startsWith("Part Highlighted=") && msg.endsWith("=Part Highlighted") ||
                            msg.startsWith("Part Group Highlighted=") && msg.endsWith("=Part Group Highlighted") ||
                            msg.startsWith("RepairStart=") && msg.endsWith("=RepairStart") ||
                            msg.startsWith("Modify Blend Time=") && msg.endsWith("=Modify Blend Time") ||
                            msg == "RepairEnd" ||
                            msg == "DiagramConflict" ||
                            msg == "Conflict" ||
                            msg == "RefinishSeparateConflict" ||
                            msg.startsWith("PartLocationConflict=") && msg.endsWith("=PartLocationConflict") ||
                            msg == "AddonsCheckbox" ||
                            msg == "DiagramPartsCheckbox" ||
                            msg == "PartsCheckbox" ||
                            msg == "NotesCheckbox" ||
                            msg == "PrintDocumentsCheckbox" ||
                            msg == "No Conflict" ||
                            msg == "No Checkbox" ||
                            msg == "Estimate Setup" ||
                            msg == "Insert Line Setup" ||
                            msg == "Note Line Setup" ||
                            msg == "Zoom" ||
                            (msg.startsWith("Extra Repairs=") && msg.endsWith("=End of Extra Repairs")) ||
                            msg == "Server Restart"
                        ) break
                        //Google messages begin with Google, followed by the part number and then ending with </Google>
                        //Ex: Google14356458234</Google>
                        else if (msg.endsWith("</Google>")) {
                            break
                        }
                        else if(msg.endsWith("</Update Line Setup>")){
                            break
                        }
                    }
                    catch(e: Exception){
                        throwException = true
                        emit(Resource.Error(message = "Lost connection to server"))
                        _serverDataState.value = RepairViewState()
                    }
                }

                try {
                    if (msg == "Screen") {
                        val sizeAr = ByteArray(4)
                        input.read(sizeAr)
                        val size = ByteBuffer.wrap(sizeAr).asIntBuffer().get()
                        if(size < 400000){
                            var imageAr = ByteArray(size)

                            var bytesRead = input.read(imageAr, 0, imageAr.size)
                            var current = bytesRead

                            do {
                                bytesRead = input.read(imageAr, current, imageAr.size - current)
                                if (bytesRead >= 0) current += bytesRead
                            } while (bytesRead > 0)

                            val options = BitmapFactory.Options()
                            options.inPreferredConfig = Bitmap.Config.RGB_565
                            var bitmap = BitmapFactory.decodeByteArray(imageAr, 0, imageAr.size, options)

                            // Keeps RAM usage a little bit lower at times compared to just applying bitmap directly to serverDataState.value
                            // perhaps because the same bitmap is being used
                            var screenBitmap = _serverDataState.value.screen?.config?.let {
                                _serverDataState.value.screen?.copy(
                                    it, true)
                            }
                            if(screenBitmap != null){
                                val canvas = Canvas(screenBitmap)
                                canvas.drawBitmap(bitmap, 0f, 0f, null)
                                _serverDataState.value = _serverDataState.value.copy(screen = screenBitmap)
                                emit(Resource.Success(_serverDataState.value))
                            }else{
                                _serverDataState.value = _serverDataState.value.copy(screen = bitmap)
                                emit(Resource.Success(_serverDataState.value))
                            }
                        }
                    } else if(msg.startsWith("Part Highlighted=") && msg.endsWith("=Part Highlighted")){
                        var message = msg.split("=")
                        var isPartHighlighted = message[1]

                        var tempState = _serverDataState.value.copy()
                        if(isPartHighlighted == "true"){
                            tempState = tempState.copy(isPartHighlighted = 1)
                        }else{
                            tempState = tempState.copy(isPartHighlighted = 2)
                        }
                        emit(Resource.Success(tempState))
                    } else if(msg.startsWith("Part Group Highlighted=") && msg.endsWith("=Part Group Highlighted")){
                        /*
                        var message = msg.split("=")
                        var isPartGroupHighlighted = message[1]

                        var tempState = _serverDataState.value.copy()
                        if(isPartGroupHighlighted == "true"){
                            tempState = tempState.copy(isPartGroupHighlighted = 1)
                        }else{
                            tempState = tempState.copy(isPartGroupHighlighted = 2)
                        }
                        emit(Resource.Success(tempState))

                         */
                    }else if (msg == "Conflict") {
                        val sizeAr = ByteArray(4)
                        input.read(sizeAr)

                        val size = ByteBuffer.wrap(sizeAr).asIntBuffer().get()

                        var imageAr = ByteArray(size)

                        var bytesRead = input.read(imageAr, 0, imageAr.size)
                        var current = bytesRead

                        do {
                            bytesRead = input.read(imageAr, current, imageAr.size - current)
                            if (bytesRead >= 0) current += bytesRead
                        } while (bytesRead > 0)

                        val options = BitmapFactory.Options()
                        options.inPreferredConfig = Bitmap.Config.RGB_565
                        var bitmap = BitmapFactory.decodeByteArray(imageAr, 0, imageAr.size);
                        var bitmapList = mutableListOf<Bitmap>()
                        bitmapList.addAll(_serverDataState.value.conflictImages)
                        bitmapList.add(bitmap)
                        _serverDataState.value =
                            _serverDataState.value.copy(conflictImages = bitmapList)
                        emit(Resource.Success(_serverDataState.value))
                    }else if (msg == "DiagramConflict") {
                        val sizeAr = ByteArray(4)
                        input.read(sizeAr)

                        val size = ByteBuffer.wrap(sizeAr).asIntBuffer().get()

                        var imageAr = ByteArray(size)

                        var bytesRead = input.read(imageAr, 0, imageAr.size)
                        var current = bytesRead

                        do {
                            bytesRead = input.read(imageAr, current, imageAr.size - current)
                            if (bytesRead >= 0) current += bytesRead
                        } while (bytesRead > 0)

                        val options = BitmapFactory.Options()
                        options.inPreferredConfig = Bitmap.Config.RGB_565
                        var bitmap = BitmapFactory.decodeByteArray(imageAr, 0, imageAr.size);
                        var bitmapList = mutableListOf<Bitmap>()
                        bitmapList.addAll(_serverDataState.value.conflictImagesWithDiagram)
                        bitmapList.add(bitmap)
                        _serverDataState.value =
                            _serverDataState.value.copy(conflictImagesWithDiagram = bitmapList)
                        emit(Resource.Success(_serverDataState.value))
                    }else if (msg.startsWith("RepairStart=") && msg.endsWith("=RepairStart")) {
                        var message = msg.split("=")
                        var repair = message[1]
                        _serverDataState.value = _serverDataState.value.copy(repairName = repair)
                        emit(Resource.Success(_serverDataState.value))
                    } else if (msg.startsWith("Modify Blend Time=") && msg.endsWith("=Modify Blend Time")){
                        var message = msg.split("=")
                        var blendHours = message[1]
                        _serverDataState.value = _serverDataState.value.copy(blendTime = blendHours)
                        emit(Resource.Success(_serverDataState.value))
                    } else if (msg == "RepairEnd"){
                        _serverDataState.value = _serverDataState.value.copy(repairName = null)
                        emit(Resource.Success(_serverDataState.value))
                    }else if (msg == "RefinishSeparateConflict"){
                        _serverDataState.value = _serverDataState.value.copy(conflictRefinishSeparate = true)
                        emit(Resource.Success(_serverDataState.value))
                    } else if(msg.startsWith("PartLocationConflict=") && msg.endsWith("=PartLocationConflict")){
                        var message = msg.split("=")
                        var locationType = message[1].toInt()
                        _serverDataState.value = _serverDataState.value.copy(conflictPartLocation = locationType)
                        emit(Resource.Success(_serverDataState.value))
                    } else if (msg == "AddonsCheckbox") {
                        val sizeAr = ByteArray(4)
                        input.read(sizeAr)

                        val size = ByteBuffer.wrap(sizeAr).asIntBuffer().get()

                        var imageAr = ByteArray(size)

                        var bytesRead = input.read(imageAr, 0, imageAr.size)
                        var current = bytesRead

                        do {
                            bytesRead = input.read(imageAr, current, imageAr.size - current)
                            if (bytesRead >= 0) current += bytesRead
                        } while (bytesRead > 0)

                        val options = BitmapFactory.Options()
                        options.inPreferredConfig = Bitmap.Config.RGB_565
                        var bitmap = BitmapFactory.decodeByteArray(imageAr, 0, imageAr.size);
                        var bitmapList = mutableListOf<Bitmap>()
                        bitmapList.addAll(_serverDataState.value.checkboxAddonImages)
                        bitmapList.add(bitmap)
                        _serverDataState.value =
                            _serverDataState.value.copy(checkboxAddonImages = bitmapList)
                        emit(Resource.Success(_serverDataState.value))
                    } else if (msg == "DiagramPartsCheckbox") {
                        val sizeAr = ByteArray(4)
                        input.read(sizeAr)

                        val size = ByteBuffer.wrap(sizeAr).asIntBuffer().get()

                        var imageAr = ByteArray(size)

                        var bytesRead = input.read(imageAr, 0, imageAr.size)
                        var current = bytesRead

                        do {
                            bytesRead = input.read(imageAr, current, imageAr.size - current)
                            if (bytesRead >= 0) current += bytesRead
                        } while (bytesRead > 0)

                        val options = BitmapFactory.Options()
                        options.inPreferredConfig = Bitmap.Config.RGB_565
                        var bitmap = BitmapFactory.decodeByteArray(imageAr, 0, imageAr.size);
                        var bitmapList = mutableListOf<Bitmap>()
                        bitmapList.addAll(_serverDataState.value.checkboxPartsImages)
                        bitmapList.add(bitmap)
                        _serverDataState.value =
                            _serverDataState.value.copy(checkboxPartsImagesWithDiagram = bitmapList)
                        emit(Resource.Success(_serverDataState.value))
                    } else if (msg == "PartsCheckbox") {
                        val sizeAr = ByteArray(4)
                        input.read(sizeAr)

                        val size = ByteBuffer.wrap(sizeAr).asIntBuffer().get()

                        var imageAr = ByteArray(size)

                        var bytesRead = input.read(imageAr, 0, imageAr.size)
                        var current = bytesRead

                        do {
                            bytesRead = input.read(imageAr, current, imageAr.size - current)
                            if (bytesRead >= 0) current += bytesRead
                        } while (bytesRead > 0)

                        val options = BitmapFactory.Options()
                        options.inPreferredConfig = Bitmap.Config.RGB_565
                        var bitmap = BitmapFactory.decodeByteArray(imageAr, 0, imageAr.size);
                        var bitmapList = mutableListOf<Bitmap>()
                        bitmapList.addAll(_serverDataState.value.checkboxPartsImages)
                        bitmapList.add(bitmap)
                        _serverDataState.value =
                            _serverDataState.value.copy(checkboxPartsImages = bitmapList)
                        emit(Resource.Success(_serverDataState.value))
                    } else if (msg == "NotesCheckbox") {
                        val sizeAr = ByteArray(4)
                        input.read(sizeAr)

                        val size = ByteBuffer.wrap(sizeAr).asIntBuffer().get()

                        var imageAr = ByteArray(size)

                        var bytesRead = input.read(imageAr, 0, imageAr.size)
                        var current = bytesRead

                        do {
                            bytesRead = input.read(imageAr, current, imageAr.size - current)
                            if (bytesRead >= 0) current += bytesRead
                        } while (bytesRead > 0)

                        val options = BitmapFactory.Options()
                        options.inPreferredConfig = Bitmap.Config.RGB_565
                        var bitmap = BitmapFactory.decodeByteArray(imageAr, 0, imageAr.size);
                        var bitmapList = mutableListOf<Bitmap>()
                        bitmapList.addAll(_serverDataState.value.checkboxNoteImages)
                        bitmapList.add(bitmap)
                        _serverDataState.value = _serverDataState.value.copy(checkboxNoteImages = bitmapList)
                        emit(Resource.Success(_serverDataState.value))
                    } else if (msg == "PrintDocumentsCheckbox") {
                        val sizeAr = ByteArray(4)
                        input.read(sizeAr)

                        val size = ByteBuffer.wrap(sizeAr).asIntBuffer().get()

                        var imageAr = ByteArray(size)

                        var bytesRead = input.read(imageAr, 0, imageAr.size)
                        var current = bytesRead

                        do {
                            bytesRead = input.read(imageAr, current, imageAr.size - current)
                            if (bytesRead >= 0) current += bytesRead
                        } while (bytesRead > 0)

                        val options = BitmapFactory.Options()
                        options.inPreferredConfig = Bitmap.Config.RGB_565
                        var bitmap = BitmapFactory.decodeByteArray(imageAr, 0, imageAr.size);
                        var bitmapList = mutableListOf<Bitmap>()
                        bitmapList.addAll(_serverDataState.value.checkboxPrintDocumentImages)
                        bitmapList.add(bitmap)
                        _serverDataState.value = _serverDataState.value.copy(checkboxPrintDocumentImages = bitmapList)
                        emit(Resource.Success(_serverDataState.value))
                    } else if (msg == "No Conflict") {
                        _serverDataState.value = _serverDataState.value.copy(conflictImages = emptyList())
                        _serverDataState.value = _serverDataState.value.copy(conflictImagesWithDiagram = emptyList())
                        emit(Resource.Success(_serverDataState.value))
                    } else if (msg == "No Checkbox") {
                        _serverDataState.value = _serverDataState.value.copy(checkboxAddonImages = emptyList())
                        _serverDataState.value = _serverDataState.value.copy(checkboxPartsImages = emptyList())
                        _serverDataState.value = _serverDataState.value.copy(checkboxNoteImages = emptyList())
                        _serverDataState.value = _serverDataState.value.copy(checkboxPrintDocumentImages = emptyList())
                        emit(Resource.Success(_serverDataState.value))
                    } else if (msg.startsWith("Google") && msg.endsWith("</Google>")) {
                        //Get part number between these strings
                        val startIndex = 6  //Google ends at index 5
                        val endIndex = msg.length - 9  //</Google> begins 9 after the part number
                        val partNumber = msg.subSequence(startIndex, endIndex).toString()
                        //We add the screen as well so the nav arrows don't move to the center of the screen when the screenshot goes away
                        val tempState = RepairViewState(googlePartNumber = partNumber, screen = _serverDataState.value.screen)
                        emit(Resource.Success(tempState))
                    }else if (msg == "Estimate Setup") {
                        val tempState = RepairViewState(openNewWorkfile = true)
                        emit(Resource.Success(tempState))
                    }else if (msg == "Insert Line Setup") {
                        val tempState = RepairViewState(openInsertLine = true)
                        emit(Resource.Success(tempState))
                    }else if(msg == "Note Line Setup"){
                        _serverDataState.value = _serverDataState.value.copy(showNoteLine = true)
                        emit(Resource.Success(_serverDataState.value))
                    }
                    else if(msg.startsWith("Update Line Setup") && msg.endsWith("</Update Line Setup>")){
                        //Msg is "Update Line Setup^^^line^^^quantity^^^price^^^labor^^^</Update Line Setup>
                        //var message = msg.removePrefix("Update Line Setup")
                        //message = msg.removeSuffix("</Update Line Setup>")
                        var msgList = msg.split("^^^").toMutableList()
                        msgList.removeAt(6) //removes </Update Line Setup>
                        msgList.removeAt(0) //removes Update Line Setup

                        var line = msgList[0] //the line description
                        if(line.contains("/")){
                            line = line.replace("/", "^") //replace / with ^ temporarily because / will crash the navigation to update line screen, thinking it's a navigation path
                            msgList[0] = line
                        }
                        val tempState = RepairViewState(openUpdateLine = msgList)
                        emit(Resource.Success(tempState))
                    }else if (msg == "Zoom") {
                        //Only want a one time change to automatically zoom in, but user can change it
                        //When using a temp state, otherwise zoomimageview will stay zoomed permanently
                        //val tempState = _serverDataState.value.copy(zoomForParts = true)
                        //emit(Resource.Success(tempState))
                        //We allow this to update to show the add part button, but we prevent the zoom from being changed in viewmodel
                        _serverDataState.value = _serverDataState.value.copy(zoomForParts = true, addPartsButton = true)
                        emit(Resource.Success(_serverDataState.value))
                    }else if (msg.startsWith("Extra Repairs=") && msg.endsWith("=End of Extra Repairs")) {
                        var message = msg
                        message = message.removePrefix("Extra Repairs=")
                        message = message.removeSuffix("=End of Extra Repairs")
                        val list = message.split("=")
                        _serverDataState.value = _serverDataState.value.copy(extraRepairs = list)
                        _serverDataState.value = _serverDataState.value.copy(extraRepairCategories = createCategoriesForExtraRepairs(list))
                        emit(Resource.Success(_serverDataState.value))
                    }else if(msg == "Server Restart"){
                        throwException = true
                        emit(Resource.Error(message = "Lost connection to server"))
                        _serverDataState.value = RepairViewState()
                    }
                }catch(e: Exception){
                    throwException = true
                    emit(Resource.Error(message = "Lost connection to server"))
                    _serverDataState.value = RepairViewState()
                }
            }
        }
    }

    //Used by secondary screens such as PhotoTaker, InsertLineScreen, etc that aren't RepairViewScreen,
    //to listen for server disconnection events while RepairViewScreen is in the background. This allows
    //these screens to send the user back to QRCodeScreen
    override suspend fun listenSecondary(): Flow<Resource<RepairViewState>> {
        throwException = false
        return flow {
            while (true) {
                try {
                    if(throwException){
                        throw Exception()
                    }
                } catch (e: Exception) {
                    emit(Resource.Error(message = "Lost connection to server"))
                    _serverDataState.value = RepairViewState()
                }
            }
        }
    }

    override suspend fun sendTouchCoordinates(): String {
        TODO("Not yet implemented")
    }

    override suspend fun sendVoiceToText(speech: String) {
        //output.write(speech.toByteArray())
    }

    override suspend fun sendExtraRepairSelections(selections: String) {
        _serverDataState.value = _serverDataState.value.copy(extraRepairs = emptyList())
        _serverDataState.value = _serverDataState.value.copy(extraRepairCategories = emptyList())
        delay(500)
        sendVoiceToText(selections)
        //Will get updated on the next screen share
    }

    override suspend fun sendImages(uris: List<File>) {
        uris.forEachIndexed { index, image ->
            /* val fileInputStream = FileInputStream(it.absolutePath)
             try {
                 output.write("image=".toByteArray())
                 var bytes = 0
                 output.writeLong(it.length())
                 val buffer = ByteArray(it.length().toInt())
                 while (fileInputStream.read(buffer).also { bytes = it } != -1) {
                 }
                 output.write(buffer)
                 output.flush()
                 fileInputStream.close()
             } finally {
                 //output.flush()
             }*/
            try{
                //#1 working
                /*
                output.write("image=".toByteArray())
                val byteArray = ByteArray(it.length().toInt())
                val bufferedInputStream = BufferedInputStream(FileInputStream(it.absolutePath))
                bufferedInputStream.read(byteArray, 0, byteArray.size)
                output.write(byteArray)
                output.flush()
                bufferedInputStream.close()
                */
                output.write("image=".encodeToByteArray())
                delay(100)

                val fileInputStream = FileInputStream(image.absolutePath)
                var buffer = ByteArray(1024)
                var length = 0

                length = fileInputStream.read(buffer, 0, buffer.size)
                while(length != -1){
                    output.write(buffer, 0, buffer.size)
                    length = fileInputStream.read(buffer, 0, buffer.size)
                }
                //output.flush()
                fileInputStream.close()
                delay(100)

                if(uris.size-1 > index){
                    //Image ended, new image will come after
                    output.write("imageended=".encodeToByteArray())
                }else{
                    //No more images for server to process. Alerts server to last photo
                    output.write("finalimage=".encodeToByteArray())
                }
                delay(100)

            }catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    override suspend fun sendFilenames(filenames: List<String>) {
        var stringOfFileNames = "imagefilenames"
        filenames.forEach {filename ->
            stringOfFileNames = stringOfFileNames + "^^^" + filename
        }
        sendVoiceToText(stringOfFileNames)
    }

    override suspend fun sendConflictSelectionNumber(selection: String) {
        _serverDataState.value = _serverDataState.value.copy(conflictImages = emptyList())
        sendVoiceToText(selection)
    }

    override suspend fun sendDiagramConflictSelectionNumber(selection: String) {
        _serverDataState.value = _serverDataState.value.copy(conflictImagesWithDiagram = emptyList())
        sendVoiceToText(selection)
    }

    override suspend fun sendImagesAndFilenames(uris: List<File>, filenames: List<String>) {
        sendFilenames(filenames)
        delay(500)
        sendImages(uris)
    }

    override suspend fun sendCheckboxPrintDocuments(selections: String) {
        _serverDataState.value = _serverDataState.value.copy(checkboxPrintDocumentImages = emptyList())
        sendVoiceToText(selections)
    }

    override suspend fun sendCheckboxAddonSelectionNumbers(selections: String) {
        _serverDataState.value = _serverDataState.value.copy(checkboxAddonImages = emptyList())
        sendVoiceToText(selections)
    }

    override suspend fun sendCheckboxPartSelectionNumbers(selections: String) {
        _serverDataState.value = _serverDataState.value.copy(checkboxPartsImages = emptyList())
        sendVoiceToText(selections)
    }

    override suspend fun sendDiagramCheckboxPartSelectionNumbers(selections: String) {
        _serverDataState.value = _serverDataState.value.copy(checkboxPartsImagesWithDiagram = emptyList())
        sendVoiceToText(selections)
    }

    override suspend fun sendRefinishSeparateYesNoCancel(choice: String) {
        _serverDataState.value = _serverDataState.value.copy(conflictRefinishSeparate = false)
        sendVoiceToText(choice)
    }

    override suspend fun sendBlendTimeOrCancel(choice: String) {
        _serverDataState.value = _serverDataState.value.copy(blendTime = null)
        sendVoiceToText(choice)
    }

    override suspend fun sendPartLocation(choice: String) {
        _serverDataState.value = _serverDataState.value.copy(conflictPartLocation = 0)
        sendVoiceToText(choice)
    }

    override suspend fun addPart() {
        _serverDataState.value = _serverDataState.value.copy(zoomForParts = false)
        _serverDataState.value = _serverDataState.value.copy(addPartsButton = false)
        sendVoiceToText("Add part")
    }

    override suspend fun sendLineNote(note: String) {
        _serverDataState.value = _serverDataState.value.copy(showNoteLine = false)
        sendVoiceToText(note)
    }

    override suspend fun cancelLineNote(cancel: String) {
        _serverDataState.value = _serverDataState.value.copy(showNoteLine = false)
        sendVoiceToText(cancel)
    }

    override suspend fun clearConflicts() {
        _serverDataState.value = _serverDataState.value.copy(conflictImages = emptyList())
        sendVoiceToText("clear conflicts")
    }

    override suspend fun clearConflictsWithDiagram() {
        _serverDataState.value = _serverDataState.value.copy(conflictImagesWithDiagram = emptyList())
        sendVoiceToText("clear conflicts with diagram")
    }

    override suspend fun clearAddonsCheckboxes() {
        _serverDataState.value = _serverDataState.value.copy(checkboxAddonImages = emptyList())
        sendVoiceToText("clear checkbox addons")
    }

    override suspend fun clearPartsCheckboxes() {
        _serverDataState.value = _serverDataState.value.copy(checkboxPartsImages = emptyList())
        sendVoiceToText("clear checkbox parts")
    }

    override suspend fun clearPartsCheckboxesWithDiagram() {
        _serverDataState.value = _serverDataState.value.copy(checkboxPartsImagesWithDiagram = emptyList())
        sendVoiceToText("clear checkbox parts with diagram")
    }

    override suspend fun clearNotesCheckboxes() {
        _serverDataState.value = _serverDataState.value.copy(checkboxNoteImages = emptyList())
        sendVoiceToText("clear checkbox notes")
    }

    override suspend fun clearPrintDocsCheckboxes() {
        _serverDataState.value = _serverDataState.value.copy(checkboxPrintDocumentImages = emptyList())
        sendVoiceToText("clear checkbox print documents")
    }

    override suspend fun clearExtraRepairs() {
        _serverDataState.value = _serverDataState.value.copy(extraRepairs = emptyList())
        _serverDataState.value = _serverDataState.value.copy(extraRepairCategories = emptyList())
        sendVoiceToText("clear extra repairs")
    }

    override suspend fun updateExtraRepairListAfterDropdownClick(newList: List<String>) {
        _serverDataState.value = _serverDataState.value.copy(extraRepairs = newList)
        _serverDataState.value = _serverDataState.value.copy(extraRepairCategories = createCategoriesForExtraRepairs(newList))
        //Will get updated on the next screen share
    }

    override suspend fun sendRepairChoiceHours(repairTime: String) {
        //split the space to only take the number value
        val time = repairTime.split(" ")
        val hours = time[0]
        sendVoiceToText("Repair part=$hours")
    }
}