package com.example.signaturecapture

import android.graphics.Bitmap

interface OnSignedCaptureListener {
    fun onSignatureCaptured(bitmap: Bitmap, fileUri: String)
}