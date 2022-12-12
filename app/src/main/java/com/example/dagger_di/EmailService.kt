package com.example.dagger_di

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun send(message : String){
        Log.d(Tag,message)

    }
}