package com.dohman.simplebudgetapp.di

import com.dohman.simplebudgetapp.MainApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class), (RepositoryModule::class), (DataSourceModule::class)])
interface RepositoryComponent : DataSourceComponent {
    companion object : RepositoryComponent by MainApplication.repositoryComponent

    //fun inject(viewModel: MainViewModel)
}