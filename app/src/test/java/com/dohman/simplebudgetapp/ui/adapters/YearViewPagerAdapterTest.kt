package com.dohman.simplebudgetapp.ui.adapters

import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class YearViewPagerAdapterTest {
    lateinit var yearAdapter: YearViewPagerAdapter

    @Before
    fun setUp() {
        yearAdapter = YearViewPagerAdapter(fm = mockk())
    }

    @Test
    fun `When provided the adapter with one item, it should contain one item`() {
        yearAdapter.addYearFragment(fragment = mockk(), title = "")
        assertEquals(1, yearAdapter.count)
    }

    @Test
    fun `When provided the adapter with ten items, it should contain ten items`() {
        repeat((1..10).count()) { yearAdapter.addYearFragment(fragment = mockk(), title = "") }
        assertEquals(10, yearAdapter.count)
    }

    @Test
    fun `When added items and cleared it twice, it should be empty`() {
        repeat((1..10).count()) { yearAdapter.addYearFragment(fragment = mockk(), title = "") }
        yearAdapter.clear()

        repeat((1..5).count()) { yearAdapter.addYearFragment(fragment = mockk(), title = "") }
        yearAdapter.clear()

        assertTrue(yearAdapter.fragmentList.isEmpty())
        assertTrue(yearAdapter.fragmentList.isEmpty())
    }

    @Test
    fun `When getting the page title, it should return the right title`() {
        for (index in 0 until 15) {
            val title = when (index) {
                3 -> "1992"
                6 -> "2001"
                10 -> "2020"
                14 -> "3129"
                else -> ""
            }

            yearAdapter.addYearFragment(fragment = mockk(), title = title)
        }

        assertEquals("1992", yearAdapter.getPageTitle(3))
        assertEquals("", yearAdapter.getPageTitle(4))
        assertEquals("2001", yearAdapter.getPageTitle(6))
        assertEquals("2020", yearAdapter.getPageTitle(10))
        assertEquals("", yearAdapter.getPageTitle(12))
        assertEquals("3129", yearAdapter.getPageTitle(14))
    }
}