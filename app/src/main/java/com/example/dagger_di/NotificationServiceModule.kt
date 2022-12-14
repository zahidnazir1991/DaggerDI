package com.example.dagger_di

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
//class NotificationServiceModule (private val retry : Int) {
class NotificationServiceModule {
    // this values is passed from home activity
    // dynamic  value pass karny ka aik teriqa ya ha k hum oper value define kar lain then nechy use kar lain
    @Singleton
    @SMSQuilifier
    @Provides
    fun getNotificationServiceObject(retry : Int, dummy : String) : UserNotificationService{
        return SMSService(retry,dummy);
        //return SMSService(3); give hardcode value here
    }

    @Named("email")
    @Provides
    fun getEmailServiceObject(emailService: EmailService) : UserNotificationService{
        return emailService;
    }


}