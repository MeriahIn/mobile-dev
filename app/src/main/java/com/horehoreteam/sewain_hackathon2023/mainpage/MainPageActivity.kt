package com.horehoreteam.sewain_hackathon2023.mainpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.horehoreteam.sewain_hackathon2023.R
import com.horehoreteam.sewain_hackathon2023.databinding.ActivityMainPageBinding

class MainPageActivity : AppCompatActivity() {

    private lateinit var navController:NavController
    private lateinit var binding:ActivityMainPageBinding
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpNavigation()
    }

    private fun setUpNavigation() {
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_framgent) as NavHostFragment
        navController = navHostFragment.navController
        binding.bnvMainpage.setupWithNavController(navController)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.home,
                R.id.order,
                R.id.notif,
                R.id.profile
            )
        )
    }
}