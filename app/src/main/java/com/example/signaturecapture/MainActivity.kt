package com.example.signaturecapture

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnSignedCaptureListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonShowDialog.setOnClickListener { showDialog() }
    }

    private fun showDialog() {
        val dialogFragment = SignatureDialogFragment(this)
        dialogFragment.show(supportFragmentManager, "signature")
    }
    override fun onSignatureCaptured(bitmap: Bitmap, fileUri: String) {
        imageView.setImageBitmap(bitmap)
    }
}
