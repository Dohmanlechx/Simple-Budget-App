package com.dohman.simplebudgetapp.di

import dagger.Module

@Module
class DataSourceModule {

    /*
    * Example:
    *
    *       @Provides
            @Singleton
            fun providesRetrofit(okHttpClient: OkHttpClient): Retrofit =
                Retrofit.Builder()
                    .baseUrl("https://private-a354f1d-pizzaapp.apiary-mock.com/")
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
    * */
}