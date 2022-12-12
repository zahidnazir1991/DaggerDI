package com.example.dagger_di

import android.util.Log
import javax.inject.Inject


interface UserRepository{
    fun saveUser(name : String, email : String)
}
class SqlRepository @Inject constructor() : UserRepository{
  override fun saveUser(name : String, email : String){
        Log.d(Tag,"Save user in local Database")
    }
}

class FirebaseRepository  : UserRepository{
    override fun saveUser(name : String, email : String){
        Log.d(Tag,"Save user in Firebase")
    }
}