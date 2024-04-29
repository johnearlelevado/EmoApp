package com.example.emoapp.utils

import android.content.Context
import java.util.Scanner

object Util {
    fun readRawResourceAsString(context: Context, resourceId: Int): String? {
        val resources = context.resources
        val inputStream = resources.openRawResource(resourceId)
        val scanner = Scanner(inputStream)
        val stringBuilder = StringBuilder()
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine())
        }
        return stringBuilder.toString()
    }
}