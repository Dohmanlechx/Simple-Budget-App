package com.dohman.simplebudgetapp.viewmodels

import androidx.lifecycle.ViewModel
import com.dohman.simplebudgetapp.di.RepositoryComponent

class MainActivityViewModel : ViewModel() {

    init {
        RepositoryComponent.inject(this)
    }
}