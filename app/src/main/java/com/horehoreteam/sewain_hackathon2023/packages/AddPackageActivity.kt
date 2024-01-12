package com.horehoreteam.sewain_hackathon2023.packages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.horehoreteam.sewain_hackathon2023.databinding.ActivityAddPackageBinding

class AddPackageActivity : AppCompatActivity() {

    private var _binding: ActivityAddPackageBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityAddPackageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}