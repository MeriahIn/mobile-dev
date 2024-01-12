package com.horehoreteam.sewain_hackathon2023.packages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.horehoreteam.sewain_hackathon2023.R
import com.horehoreteam.sewain_hackathon2023.databinding.ActivityMainPageBinding
import com.horehoreteam.sewain_hackathon2023.databinding.ActivityPacketBinding

class PacketActivity : AppCompatActivity() {

    private lateinit var binding:ActivityPacketBinding
    private lateinit var navController: NavController
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPacketBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpNavigation()
    }

    private fun setUpNavigation() {
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_framgent) as NavHostFragment
        navController = navHostFragment.navController
        binding.bnvPacket.setupWithNavController(navController)
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