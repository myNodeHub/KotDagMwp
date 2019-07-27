package com.example.kotdagmvp.di.components

import android.content.Context

import com.example.kotdagmvp.base.MyApplication
import com.example.kotdagmvp.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component

import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }

    fun inject(app: MyApplication)
}
