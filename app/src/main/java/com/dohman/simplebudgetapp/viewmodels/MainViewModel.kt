package com.dohman.simplebudgetapp.viewmodels

import androidx.lifecycle.ViewModel
import com.dohman.simplebudgetapp.di.RepositoryComponent

class MainViewModel : ViewModel() {
    //@Inject
    // lateinit var exampleRepo: ExampleRepository

    init {
        RepositoryComponent.inject(this)
    }

    fun getYears(): List<Int> {
        // TODO: Return nowYear + 2 further or so
        return listOf(2020, 2021, 2022)
    }
}