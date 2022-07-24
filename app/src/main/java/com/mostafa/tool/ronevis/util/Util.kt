package com.mostafa.tool.ronevis.util

import android.app.Activity
import android.content.Context
import android.os.Looper
import android.widget.Toast

fun showToast(context: Context, message: String, length: Int) {
    if (context is Activity) {
        if (!context.isFinishing && !context.isDestroyed) {
            Toast.makeText(context, message, length).show()
        }
    } else {
        Toast.makeText(context, message, length).show()
    }
}

fun isOnMainThread() = Looper.myLooper() == Looper.getMainLooper()

fun doOnBackgroundThread(callback: () -> Unit) {
    if (isOnMainThread()) {
        Thread {
            callback()
        }.start()
    } else {
        callback()
    }
}
