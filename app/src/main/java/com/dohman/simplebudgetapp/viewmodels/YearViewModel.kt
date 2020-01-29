package com.dohman.simplebudgetapp.viewmodels

import androidx.lifecycle.ViewModel
import com.dohman.simplebudgetapp.di.RepositoryComponent
import com.dohman.simplebudgetapp.ui.items.MonthSavingItem
import org.threeten.bp.LocalDate

class YearViewModel : ViewModel() {

    // Temporary
    val allMonths = listOf("January", "February", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec")

    init {
        RepositoryComponent.inject(this)
    }

    fun getMonthSavingViews(): List<MonthSavingItem> {
        return allMonths.map { MonthSavingItem(date = LocalDate.now()) }
    }

    fun totalSavingsThisYear(year: Int): Int {
        // TODO
        return 2000
    }
}