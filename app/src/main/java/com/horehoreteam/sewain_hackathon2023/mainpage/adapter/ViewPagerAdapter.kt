package com.horehoreteam.sewain_hackathon2023.mainpage.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.horehoreteam.sewain_hackathon2023.mainpage.OrderChildPagerFragment

class ViewPagerAdapter(
    activity:FragmentActivity
):FragmentStateAdapter(activity) {
    override fun getItemCount() = 3
    override fun createFragment(position: Int): Fragment {
        return OrderChildPagerFragment().also {
            it.arguments = Bundle().apply {
                putInt(OrderChildPagerFragment.KEY_POSITION, position)
            }
        }
    }
}