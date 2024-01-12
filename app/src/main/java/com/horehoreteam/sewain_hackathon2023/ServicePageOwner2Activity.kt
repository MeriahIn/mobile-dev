package com.horehoreteam.sewain_hackathon2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.horehoreteam.sewain_hackathon2023.databinding.ActivityServicePageOwner2Binding

class ServicePageOwner2Activity : AppCompatActivity() {

    private lateinit var binding:ActivityServicePageOwner2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityServicePageOwner2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this)
            .load("https://www.dictio.id/uploads/db3342/original/3X/7/0/70fa31abcc18243f192c28297636f8f0cfb306c0.jpeg")
            .into(binding.acivPestaPernikahan2)
    }
}