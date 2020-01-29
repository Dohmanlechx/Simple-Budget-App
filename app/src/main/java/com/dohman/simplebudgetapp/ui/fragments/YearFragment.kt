package com.dohman.simplebudgetapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dohman.simplebudgetapp.R
import com.dohman.simplebudgetapp.ui.items.MonthSavingItem
import com.dohman.simplebudgetapp.viewmodels.YearViewModel
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter
import kotlinx.android.synthetic.main.fragment_year.*
import kotlinx.android.synthetic.main.view_annual_saving.*

class YearFragment(private val year: Int) : Fragment() {
    private lateinit var vm: YearViewModel

    private val itemAdapter = ItemAdapter<MonthSavingItem>()
    private val fastAdapter = FastAdapter.with(itemAdapter)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        vm = ViewModelProvider(this).get(YearViewModel::class.java)
        return inflater.inflate(R.layout.fragment_year, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecycler()
        setAnnualSavingText()
        loadMonthSavingViews()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        recycler.adapter = null
    }

    private fun setupRecycler() {
        recycler.adapter = fastAdapter
    }

    private fun setAnnualSavingText() {
        txt_year_annual_saving_amount.text = String.format(
            requireContext().getString(R.string.this_year_annual_saving_amount), vm.totalSavingsThisYear(year)
        )
    }

    private fun loadMonthSavingViews() {
        itemAdapter.clear()
        vm.getMonthSavingViews().forEach { itemAdapter.add(it) }
    }
}