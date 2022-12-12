package com.example.dagger_di

import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryWithBind {

    //bind sqlrepository with userrepository interface
    // this alternavte of provides all other process remains same
    // but ya tab apply ho ga jb implemented class k constructory ma inject laga ho

    @Binds
    abstract fun bindUserRepositoryInterfacewithitimplementation(sqlRepository: SqlRepository) : UserRepository


}