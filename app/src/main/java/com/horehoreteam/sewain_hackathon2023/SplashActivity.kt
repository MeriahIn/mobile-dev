package com.horehoreteam.sewain_hackathon2023

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.horehoreteam.sewain_hackathon2023.databinding.ActivitySplashBinding
import com.horehoreteam.sewain_hackathon2023.mainpage.MainPageActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val animation = ObjectAnimator.ofFloat(binding.logo2, View.ALPHA, 0f, 1f).apply {
            duration = 750L
        }
        setContentView(binding.root)
        lifecycleScope.launch {
            delay(1500)
            binding.logo1.isVisible = false
            animation.start()
            delay(1000L)
            val intent = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}