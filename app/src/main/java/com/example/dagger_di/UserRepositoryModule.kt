package com.example.dagger_di

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    @Provides
    fun getUserRepository() : UserRepository{
        // yahan pe agr koe logic implement karni ho wo b ki ja sakti ha
        //like firebase k object ma koe change karni ho ete etc
        return FirebaseRepository()
    }
}