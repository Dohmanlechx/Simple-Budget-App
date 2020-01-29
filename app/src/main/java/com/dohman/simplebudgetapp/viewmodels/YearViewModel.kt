package com.dohman.simplebudgetapp.viewmodels

import androidx.lifecycle.ViewModel
import com.dohman.simplebudgetapp.di.RepositoryComponent
import com.dohman.simplebudgetapp.repositories.DateRepository
import com.dohman.simplebudgetapp.ui.items.MonthSavingItem
import org.threeten.bp.LocalDate
import javax.inject.Inject

class YearViewModel : ViewModel() {
    @Inject
    lateinit var dateRepo: DateRepository

    init {
        RepositoryComponent.inject(this)
    }

    fun getMonthSavingViews(): List<MonthSavingItem> {
        return emptyList()//dateRepo.allMonths.map { MonthSavingItem(date = LocalDate.now()) }
    }

    fun totalSavingsThisYear(year: Int): Int {
        // TODO
        return 2000
    }
}