package com.dohman.simplebudgetapp.viewmodels

import androidx.lifecycle.ViewModel
import com.dohman.simplebudgetapp.di.RepositoryComponent
import com.dohman.simplebudgetapp.ui.items.AnnualSavingItem

class YearViewModel : ViewModel() {

    init {
        RepositoryComponent.inject(this)
    }

    fun getAnnualSavingViewOf(year: Int): AnnualSavingItem {
        return AnnualSavingItem(moneySaved = totalSavingsThisYear(year))
    }

    private fun totalSavingsThisYear(year: Int): Int {
        // TODO
        return 2000
    }
}