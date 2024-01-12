package com.horehoreteam.sewain_hackathon2023.packages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.horehoreteam.sewain_hackathon2023.R
import com.horehoreteam.sewain_hackathon2023.databinding.ActivityPackagePageBinding

class PackagePageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPackagePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPackagePageBinding.inflate(layoutInflater)

        var isDescriptionExpanded = false
        val seeDescription = binding.actvPackagePageDescription

        setContentView(binding.root)

        binding.actvPackagePageDescriptionReadmore.setOnClickListener {
            isDescriptionExpanded = !isDescriptionExpanded
        }

        if (isDescriptionExpanded) {
            seeDescription.maxLines = 20
            binding.actvPackagePageDescriptionReadmore.text = "Lebih sedikit"
        } else {
            seeDescription.maxLines = 7
            binding.actvPackagePageDescriptionReadmore.text = "Baca selengkapnya"
        }
    }
}