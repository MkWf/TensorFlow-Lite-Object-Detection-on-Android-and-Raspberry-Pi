package io.ejtech.tflite.data

import android.graphics.Bitmap
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue

data class RepairViewState(
    var serverError: Boolean = false,
    var screen: Bitmap? = null,
    var repairName: String? = null,  // indicates that there's a current repair in progress with extra repairs
    var blendTime: String? = null, // When blending, if applied to their CCC, will show popup to change blend labor time
    var conflictImages: List<Bitmap> = emptyList(),
    var conflictImagesWithDiagram: List<Bitmap> = emptyList(), // differentiates between ordinary conflict images and ones with a diagram at the start which should be handled differently
    var conflictRefinishSeparate: Boolean = false,
    var conflictPartLocation: Int = 0,   // 4 for lf, rf, lr, rr    2 for lt and rt
    var checkboxAddonImages: List<Bitmap> = emptyList(),
    var checkboxPartsImages: List<Bitmap> = emptyList(),
    var checkboxPartsImagesWithDiagram: List<Bitmap> = emptyList(),
    var checkboxNoteImages: List<Bitmap> = emptyList(),
    var checkboxPrintDocumentImages: List<Bitmap> = emptyList(),
    var showNoteLine: Boolean = false,
    var googlePartNumber: String? = null,
    var openNewWorkfile: Boolean = false,
    var openInsertLine: Boolean = false,
    var openUpdateLine: List<String> = emptyList(),
    var openCCCLogin: Boolean = false,
    var isKeyBoardVisible: Boolean = false,
    var isHelpMenuVisible: Boolean = false,
    var isRepairHoursPopupVisible: Boolean = false,
    var isTouchMouseEnabled: Boolean = false,
    var keyboardText: TextFieldValue = TextFieldValue(text = "12345", selection = TextRange(5)),
    var extraRepairs: List<String> = emptyList(),
    var extraRepairCategories: List<ExtraRepairCategory> = emptyList(),
    var zoomForParts: Boolean = false,
    var addPartsButton: Boolean = false,
    var isPartHighlighted: Int = 0, //0 do nothing, 1 true, 2 false
    var isPartGroupHighlighted: Int = 0, //0 do nothing, 1 true, 2 false
) {
}