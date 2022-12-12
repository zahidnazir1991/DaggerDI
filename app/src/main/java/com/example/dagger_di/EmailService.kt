package com.example.dagger_di

import android.util.Log
import javax.inject.Inject


interface UserNotificationService{
    fun send(message : String)
}

class EmailService @Inject constructor() :UserNotificationService {
   override fun send(message : String){
        Log.d(Tag,message)

    }
}

class SMSService @Inject constructor() :UserNotificationService {
    override fun send(message : String){
        Log.d(Tag,message)

    }
}