package com.example.dagger_di

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


interface UserNotificationService{
    fun send(message : String)
}
@Singleton
class EmailService @Inject constructor() :UserNotificationService {
   override fun send(message : String){
        Log.d(Tag,message)

    }
}

class SMSService(val retry : Int,val dummyvalue : String)  : UserNotificationService {
    override fun send(message : String){
        Log.d(Tag,message + "${retry}" + dummyvalue)

    }
}