package com.dohman.simplebudgetapp.ui.adapters

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.dohman.simplebudgetapp.ui.fragments.YearFragment

class YearViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private val yearFragments = ArrayList<YearFragment>()
    private val yearTitles = ArrayList<String>()

    val fragmentList: List<YearFragment>
        get() = yearFragments

    override fun getItem(position: Int) = yearFragments[position]
    override fun getCount() = yearFragments.size
    override fun getPageTitle(position: Int) = yearTitles[position]
    override fun getItemPosition(`object`: Any) = PagerAdapter.POSITION_NONE

    fun addYearFragment(fragment: YearFragment, title: String) {
        yearFragments.add(fragment)
        yearTitles.add(title)
    }

    fun clear() {
        yearFragments.clear()
        yearTitles.clear()
    }
}