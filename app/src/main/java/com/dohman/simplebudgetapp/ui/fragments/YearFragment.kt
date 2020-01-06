package com.dohman.simplebudgetapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.dohman.simplebudgetapp.R
import com.dohman.simplebudgetapp.ui.items.AnnualSavingItem
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter
import kotlinx.android.synthetic.main.fragment_year.*

class YearFragment(private val year: String) : Fragment() {
    //private lateinit var vm: YearViewModel

    private val itemAdapter = ItemAdapter<AnnualSavingItem>()
    private val fastAdapter = FastAdapter.with(itemAdapter)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_year, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.adapter = fastAdapter

        itemAdapter.add(AnnualSavingItem(2000))
        itemAdapter.add(AnnualSavingItem(50000))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        recycler.adapter = null
    }
}