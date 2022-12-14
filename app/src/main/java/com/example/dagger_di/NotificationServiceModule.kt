package com.example.dagger_di

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {
    @SMSQuilifier
    @Provides
    fun getNotificationServiceObject() : UserNotificationService{
        return SMSService();
    }

    @Named("email")
    @Provides
    fun getEmailServiceObject(emailService: EmailService) : UserNotificationService{
        return emailService;
    }


}