package com.example.emoapp.data

import com.example.emoapp.data.models.Response
import java.lang.ref.WeakReference

object SimpleCache {
    var response: WeakReference<Response>? = null
}