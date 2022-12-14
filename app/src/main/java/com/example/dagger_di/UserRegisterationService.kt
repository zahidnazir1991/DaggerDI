package com.example.dagger_di

import android.util.Log
import javax.inject.Inject

const val Tag : String = "MyDagger"
class UserRegisterationService @Inject constructor(val userRepository: UserRepository, @SMSQuilifier val usernotification: UserNotificationService) {
    fun userRegister(email : String, name : String){
            userRepository.saveUser(name,email)
        usernotification.send("Email sent")
    }
}