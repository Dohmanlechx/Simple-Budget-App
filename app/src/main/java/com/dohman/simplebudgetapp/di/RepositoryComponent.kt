package com.dohman.simplebudgetapp.di

import com.dohman.simplebudgetapp.MainApplication
import com.dohman.simplebudgetapp.viewmodels.MainActivityViewModel
import com.dohman.simplebudgetapp.viewmodels.MainViewModel
import com.dohman.simplebudgetapp.viewmodels.YearViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class), (RepositoryModule::class), (DataSourceModule::class)])
interface RepositoryComponent : DataSourceComponent {
    companion object : RepositoryComponent by MainApplication.repositoryComponent

    fun inject(viewModel: MainActivityViewModel)
    fun inject(viewModel: MainViewModel)
    fun inject(viewModel: YearViewModel)
}