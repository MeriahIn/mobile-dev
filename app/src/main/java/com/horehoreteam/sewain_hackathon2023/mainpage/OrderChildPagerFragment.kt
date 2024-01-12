package com.horehoreteam.sewain_hackathon2023.mainpage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.horehoreteam.sewain_hackathon2023.DataDummy
import com.horehoreteam.sewain_hackathon2023.databinding.OrderItemViewpagerLayoutBinding
import com.horehoreteam.sewain_hackathon2023.mainpage.adapter.OrderHistoryAdapter
import com.horehoreteam.sewain_hackathon2023.mainpage.adapter.OrderOnProcessingAdapter
import com.horehoreteam.sewain_hackathon2023.mainpage.adapter.OrderRequestAdapter

class OrderChildPagerFragment: Fragment() {
    private var binding:OrderItemViewpagerLayoutBinding?=null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = OrderItemViewpagerLayoutBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            when(arguments?.getInt(KEY_POSITION)){
                0 ->{
                    val adapter = OrderHistoryAdapter(
                        DataDummy.generateOrderHistory()
                    )
                    rvOrder.adapter = adapter
                    rvOrder.layoutManager = LinearLayoutManager(requireActivity())
                }
                1 ->{
                    val adapter = OrderOnProcessingAdapter(
                        DataDummy.generateOrderOnProcess()
                    )
                    rvOrder.adapter = adapter
                    rvOrder.layoutManager = LinearLayoutManager(requireActivity())
                }
                2 -> {
                    val adapter = OrderRequestAdapter(
                        DataDummy.generateOrderRequest()
                    )
                    rvOrder.adapter = adapter
                    rvOrder.layoutManager = LinearLayoutManager(requireActivity())
                }
            }

        }


    }

    companion object{
        const val KEY_POSITION = "POSITION"
    }

}