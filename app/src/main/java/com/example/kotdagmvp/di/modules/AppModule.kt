package com.example.kotdagmvp.di.modules

import com.example.kotdagmvp.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

import javax.inject.Singleton

@Module(includes = [AndroidSupportInjectionModule::class])
interface AppModule {
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    fun mainActivityInjector(): MainActivity

}
