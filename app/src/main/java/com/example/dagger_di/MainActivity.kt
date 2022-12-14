package com.example.dagger_di

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val UserComponent = DaggerUserRegisterationComponent.builder().build()
        val userRegisterationService = UserComponent.getUserRegistration()
        val getEmailSerive = UserComponent.getEmailService()
        userRegisterationService.userRegister("zahid@gmail.com","zahid")
        getEmailSerive.send("this is new message to send")
    }
}