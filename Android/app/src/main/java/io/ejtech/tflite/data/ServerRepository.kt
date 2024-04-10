package io.ejtech.tflite.data

import io.ejtech.tflite.ui.detection.Resource
import kotlinx.coroutines.flow.Flow
import java.io.File

interface ServerRepository {
    suspend fun connectToServer(ip: String, port: Int): Flow<Resource<String>>
    suspend fun listen(): Flow<Resource<RepairViewState>>
    suspend fun listenSecondary(): Flow<Resource<RepairViewState>>
    suspend fun sendTouchCoordinates(): String
    suspend fun sendVoiceToText(speech: String)
    suspend fun sendImages(uris: List<File>)
    suspend fun sendFilenames(filenames: List<String>)

    suspend fun sendConflictSelectionNumber(selection: String)
    suspend fun sendDiagramConflictSelectionNumber(selection: String)
    suspend fun sendImagesAndFilenames(uris: List<File>, filenames: List<String>)
    suspend fun sendCheckboxPrintDocuments(selections: String)
    suspend fun sendCheckboxAddonSelectionNumbers(selections: String)

    suspend fun sendCheckboxPartSelectionNumbers(selections: String)
    suspend fun sendDiagramCheckboxPartSelectionNumbers(selections: String)
    suspend fun sendExtraRepairSelections(selections: String)
    suspend fun sendRefinishSeparateYesNoCancel(choice: String)

    suspend fun sendBlendTimeOrCancel(time: String)
    suspend fun sendPartLocation(choice: String)
    suspend fun addPart()
    suspend fun sendLineNote(note: String)
    suspend fun cancelLineNote(cancel: String)
    suspend fun clearConflicts()
    suspend fun clearConflictsWithDiagram()
    suspend fun clearAddonsCheckboxes()
    suspend fun clearPartsCheckboxes()

    suspend fun clearPartsCheckboxesWithDiagram()
    suspend fun clearNotesCheckboxes()
    suspend fun clearPrintDocsCheckboxes()
    suspend fun clearExtraRepairs()
    suspend fun updateExtraRepairListAfterDropdownClick(newList: List<String>)
    suspend fun sendRepairChoiceHours(repairTime: String)
}