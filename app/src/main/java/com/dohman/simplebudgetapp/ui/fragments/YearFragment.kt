package com.dohman.simplebudgetapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.dohman.simplebudgetapp.R
import com.dohman.simplebudgetapp.ui.items.AnnualSavingItem
import com.dohman.simplebudgetapp.viewmodels.YearViewModel
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter
import kotlinx.android.synthetic.main.fragment_year.*

class YearFragment(private val year: Int) : Fragment() {
    private lateinit var vm: YearViewModel

    private val itemAdapter = ItemAdapter<AnnualSavingItem>()
    private val fastAdapter = FastAdapter.with(itemAdapter)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        vm = ViewModelProviders.of(this).get(YearViewModel::class.java)
        return inflater.inflate(R.layout.fragment_year, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecycler()
        loadAnnualSavingView()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        recycler.adapter = null
    }

    private fun setupRecycler() {
        recycler.adapter = fastAdapter
    }

    private fun loadAnnualSavingView() {
        itemAdapter.clear()
        vm.getAnnualSavingViewOf(year).let { itemAdapter.add(it) }
    }
}