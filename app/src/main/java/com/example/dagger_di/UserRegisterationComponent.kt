package com.example.dagger_di

import dagger.Component

@Component
interface UserRegisterationComponent {
 fun getUserRegistration() : UserRegisterationService
 fun getEmailService() : EmailService
}