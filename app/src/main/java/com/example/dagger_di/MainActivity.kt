package com.example.dagger_di

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
  lateinit var  userRegisterationService : UserRegisterationService
  @Inject
  lateinit var emailService: EmailService
  @Inject
  lateinit var emailService1: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val userComponent = DaggerUserRegisterationComponent.builder()
//            .notificationServiceModule(NotificationServiceModule(3))
//            .build()

        //Second way with factory

        val userComponent = DaggerUserRegisterationComponent.factory().create( 4,"this is dummy string")

        userComponent.inject(this)
        userRegisterationService.userRegister("zahid@gmail.com","zahid")
        emailService.send("Send message by zahid")


    }
}