package com.dohman.simplebudgetapp.di

import com.dohman.simplebudgetapp.repositories.DateRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    /*
    * Example:
    *       @Provides
            @Singleton
            fun providesRestaurantRepository(api: ApplicationApi) = RestaurantRepository(api)
    *
    * */

    @Provides
    @Singleton
    fun providesDateRepository() = DateRepository()
}