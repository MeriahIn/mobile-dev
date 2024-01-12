package com.horehoreteam.sewain_hackathon2023

import android.util.DisplayMetrics
import android.util.TypedValue

fun Int.toDp(displayMetrics: DisplayMetrics):Int{
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this.toFloat(), displayMetrics).toInt()
}
