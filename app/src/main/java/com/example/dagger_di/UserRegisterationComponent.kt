package com.example.dagger_di

import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

//@Component(modules = [NotificationServiceModule::class,UserRepositoryModule::class])
@Singleton
@Component(modules = [NotificationServiceModule::class,UserRepositoryModule::class])
interface UserRegisterationComponent {
fun inject(mainActivity: MainActivity)

@Component.Factory
interface Factory{
    fun create(@BindsInstance  retryCount : Int, @BindsInstance  dummy : String) : UserRegisterationComponent
}
}