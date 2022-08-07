package com.mostafa.tool.ronevis.extention

import android.app.Activity
import android.view.WindowManager
import androidx.core.content.ContextCompat

fun Activity.setStatusBarColor(color: Int) {
    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    window.statusBarColor = ContextCompat.getColor(this, color)
}
