package com.example.dagger_di

import android.util.Log
import javax.inject.Inject

const val Tag : String = "MyDagger"
class UserRegisterationService @Inject constructor(val userRepository: UserRepository, val emailService: EmailService) {
    fun userRegister(email : String, name : String){
            userRepository.saveUser(name,email)
            emailService.send("Email sent")
    }
}