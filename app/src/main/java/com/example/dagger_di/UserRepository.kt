package com.example.dagger_di

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(name : String, email : String){
        Log.d(Tag,"Username is ${name} and email ${email}")
    }
}