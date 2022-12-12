package com.example.dagger_di

import dagger.Component
import dagger.Module

//@Component(modules = [NotificationServiceModule::class,UserRepositoryModule::class])
@Component(modules = [NotificationServiceModule::class,UserRepositoryWithBind::class])
interface UserRegisterationComponent {
fun inject(mainActivity: MainActivity)
}