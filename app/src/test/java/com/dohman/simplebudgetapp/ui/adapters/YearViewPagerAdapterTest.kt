package com.dohman.simplebudgetapp.ui.adapters

import com.google.common.truth.Truth.assertThat
import io.mockk.mockk
import org.junit.Before
import org.junit.Test

class YearViewPagerAdapterTest {
    private lateinit var yearAdapter: YearViewPagerAdapter

    @Before
    fun setUp() {
        yearAdapter = YearViewPagerAdapter(fm = mockk())
    }

    @Test
    fun `When provided the adapter with one item, it should contain one item`() {
        yearAdapter.addYearFragment(fragment = mockk(), title = "")

        assertThat(yearAdapter.count).isEqualTo(1)
    }

    @Test
    fun `When provided the adapter with ten items, it should contain ten items`() {
        repeat((1..10).count()) { yearAdapter.addYearFragment(fragment = mockk(), title = "") }

        assertThat(yearAdapter.count).isEqualTo(10)
    }

    @Test
    fun `When added items and cleared it twice, it should be empty`() {
        repeat((1..10).count()) { yearAdapter.addYearFragment(fragment = mockk(), title = "") }
        yearAdapter.clear()

        repeat((1..5).count()) { yearAdapter.addYearFragment(fragment = mockk(), title = "") }
        yearAdapter.clear()

        assertThat(yearAdapter.fragmentList.isEmpty()).isTrue()
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

        assertThat(yearAdapter.getPageTitle(4).isBlank()).isTrue()
        assertThat(yearAdapter.getPageTitle(12).isBlank()).isTrue()
        assertThat(yearAdapter.getPageTitle(3)).isEqualTo("1992")
        assertThat(yearAdapter.getPageTitle(6)).isEqualTo("2001")
        assertThat(yearAdapter.getPageTitle(10)).isEqualTo("2020")
        assertThat(yearAdapter.getPageTitle(14)).isEqualTo("3129")
    }
}