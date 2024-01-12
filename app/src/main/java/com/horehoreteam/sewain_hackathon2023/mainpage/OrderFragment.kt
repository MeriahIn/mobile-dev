package com.horehoreteam.sewain_hackathon2023.mainpage

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.horehoreteam.sewain_hackathon2023.R
import com.horehoreteam.sewain_hackathon2023.databinding.FragmentOrderBinding
import com.horehoreteam.sewain_hackathon2023.mainpage.adapter.ViewPagerAdapter

class OrderFragment : Fragment() {

    private var binding:FragmentOrderBinding?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViewPager()
    }

    private fun setUpViewPager() {
        binding?.apply {
            val viewPagerAdapter = ViewPagerAdapter(requireActivity())
            vpTab.adapter = viewPagerAdapter
            val tabsTitles = resources.getStringArray(R.array.order_tab_titles)
            TabLayoutMediator(tbOrder, vpTab){ tab, pos ->
                tab.text = tabsTitles[pos]
            }.attach()
        }
    }

}