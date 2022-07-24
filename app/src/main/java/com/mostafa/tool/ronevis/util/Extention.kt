package com.mostafa.tool.ronevis.util

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.widget.Toast

fun Context.toast(id: Int, length: Int = Toast.LENGTH_SHORT) {
    toast(getString(id), length)
}

fun Context.toast(msg: String, length: Int = Toast.LENGTH_SHORT) {
    try {
        if (isOnMainThread()) {
            showToast(this, msg, length)
        } else {
            Handler(Looper.getMainLooper()).post {
                showToast(this, msg, length)
            }
        }
    } catch (e: Exception) {
    }
}

