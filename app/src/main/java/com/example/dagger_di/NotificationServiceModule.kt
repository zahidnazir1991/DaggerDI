package com.example.dagger_di

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {
    @Provides
    fun getNotificationServiceObject() : UserNotificationService{
        return SMSService();
    }


}