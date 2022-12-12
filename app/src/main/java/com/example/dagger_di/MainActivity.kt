package com.example.dagger_di

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
  lateinit var  userRegisterationService : UserRegisterationService
  @Inject
  lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userComponent = DaggerUserRegisterationComponent.builder().build()
        userComponent.inject(this)
        userRegisterationService.userRegister("zahid@gmail.com","zahid")
        emailService.send("Send message by zahid")


    }
}