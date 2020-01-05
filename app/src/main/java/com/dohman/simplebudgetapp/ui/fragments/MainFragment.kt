package com.dohman.simplebudgetapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.dohman.simplebudgetapp.R
import com.dohman.simplebudgetapp.ui.adapters.YearViewPagerAdapter
import com.dohman.simplebudgetapp.viewmodels.MainViewModel
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {
    private lateinit var vm: MainViewModel

    private lateinit var yearAdapter: YearViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vm = ViewModelProviders.of(this).get(MainViewModel::class.java)
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (!::yearAdapter.isInitialized) {
            yearAdapter = YearViewPagerAdapter(childFragmentManager)
        }

        v_pager.adapter = yearAdapter

        tabs_year.setupWithViewPager(v_pager)

        yearAdapter.addYearFragment(YearFragment("2020"), "2020")
        yearAdapter.addYearFragment(YearFragment("2021"), "2021")
        yearAdapter.addYearFragment(YearFragment("2022"), "2022")

        yearAdapter.notifyDataSetChanged()
    }

    override fun onDestroy() {
        super.onDestroy()
        yearAdapter.clear()
        v_pager.adapter = null
    }
}