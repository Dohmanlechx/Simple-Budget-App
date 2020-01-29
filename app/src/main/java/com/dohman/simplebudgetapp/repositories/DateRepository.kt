package com.dohman.simplebudgetapp.repositories

import org.threeten.bp.Month
import javax.inject.Inject

class DateRepository @Inject constructor() {

    fun getAllMonths() = (1..12).map(Month::of)
}