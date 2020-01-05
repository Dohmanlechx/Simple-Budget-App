package com.dohman.simplebudgetapp.viewmodels

import androidx.lifecycle.ViewModel
import com.dohman.simplebudgetapp.di.RepositoryComponent
import javax.inject.Inject

class MainViewModel : ViewModel() {
    //@Inject
    // lateinit var exampleRepo: ExampleRepository

    init {
        RepositoryComponent.inject(this)
    }
}