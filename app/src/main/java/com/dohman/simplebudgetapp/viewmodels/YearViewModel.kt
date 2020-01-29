package com.dohman.simplebudgetapp.viewmodels

import androidx.lifecycle.ViewModel
import com.dohman.simplebudgetapp.di.RepositoryComponent
import com.dohman.simplebudgetapp.repositories.DateRepository
import com.dohman.simplebudgetapp.ui.items.MonthSavingItem
import javax.inject.Inject

class YearViewModel : ViewModel() {
    @Inject
    lateinit var dateRepo: DateRepository

    init {
        RepositoryComponent.inject(this)
    }

    fun getMonthSavingViews(year: Int): List<MonthSavingItem> {
        return dateRepo.getAllMonths().map { month -> MonthSavingItem(date = "$month $year") }
    }

    fun totalSavingsThisYear(year: Int): Int {
        // TODO
        return 2000
    }
}