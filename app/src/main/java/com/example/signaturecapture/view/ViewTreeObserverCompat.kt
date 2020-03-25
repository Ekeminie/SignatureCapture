package com.example.signaturecapture.view

import android.annotation.SuppressLint
import android.os.Build
import android.view.ViewTreeObserver

object ViewTreeObserverCompat {
    /**
     * Remove a previously installed global layout callback.
     * @param observer the view observer
     * @param victim the victim
     */
    @SuppressLint("NewApi")
    fun removeOnGlobalLayoutListener(
        observer: ViewTreeObserver,
        victim: ViewTreeObserver.OnGlobalLayoutListener?
    ) { // Future (API16+)...
        if (Build.VERSION.SDK_INT >= 16) {
            observer.removeOnGlobalLayoutListener(victim)
        } else {
            observer.removeGlobalOnLayoutListener(victim)
        }
    }
}