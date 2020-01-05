package com.dohman.simplebudgetapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.dohman.simplebudgetapp.R
import com.dohman.simplebudgetapp.viewmodels.MainViewModel

class MainFragment : Fragment() {
    private lateinit var vm: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vm = ViewModelProviders.of(this).get(MainViewModel::class.java)

        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}