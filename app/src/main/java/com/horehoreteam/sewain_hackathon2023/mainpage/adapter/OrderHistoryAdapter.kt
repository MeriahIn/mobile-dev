package com.horehoreteam.sewain_hackathon2023.mainpage.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.horehoreteam.sewain_hackathon2023.R
import com.horehoreteam.sewain_hackathon2023.databinding.OrderItemHistoryLayoutBinding
import com.horehoreteam.sewain_hackathon2023.model.OrderHistory

class OrderHistoryAdapter (
    private val items:List<OrderHistory>
): RecyclerView.Adapter<OrderHistoryAdapter.OrderViewHolder>() {
    class OrderViewHolder(val binding: OrderItemHistoryLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        val binding = OrderItemHistoryLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return OrderViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        val currItem = items[position]
        holder.apply {
            binding.apply {
                Glide.with(itemView.context)
                    .load(currItem.imgUrl)
                    .into(civUserImageProfile)
                actvCode.text = currItem.orderId
                actvUserName.text = currItem.userName
                actvServiceName.text = currItem.serviceName
                actvPrice.text = currItem.price

                actvDone.isVisible = currItem.status == "Selesai"
                actvCanceled.isVisible = currItem.status != "Selesai"
            }
        }
    }

    override fun getItemCount() = items.size
}