package com.dohman.simplebudgetapp.di

import com.dohman.simplebudgetapp.MainApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class)])
interface AppComponent {
    fun inject(app: MainApplication)
}