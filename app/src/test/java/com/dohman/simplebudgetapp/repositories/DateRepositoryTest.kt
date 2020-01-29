package com.dohman.simplebudgetapp.repositories

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test
import org.threeten.bp.Month

class DateRepositoryTest {
    private lateinit var dateRepo: DateRepository

    @Before
    fun setUp() {
        dateRepo = DateRepository()
    }

    @Test
    fun `Getting all months should return a list of Month elements, from January to December`() {
        val expected = listOf(
            Month.JANUARY,
            Month.FEBRUARY,
            Month.MARCH,
            Month.APRIL,
            Month.MAY,
            Month.JUNE,
            Month.JULY,
            Month.AUGUST,
            Month.SEPTEMBER,
            Month.OCTOBER,
            Month.NOVEMBER,
            Month.DECEMBER
        )

        assertThat(dateRepo.getAllMonths()).isEqualTo(expected)
    }

}