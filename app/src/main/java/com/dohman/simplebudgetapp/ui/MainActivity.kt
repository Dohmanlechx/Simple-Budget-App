package com.dohman.simplebudgetapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.dohman.simplebudgetapp.R
import com.dohman.simplebudgetapp.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var vm: MainActivityViewModel
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        navController = findNavController(R.id.nav_host_fragment)
    }
}
