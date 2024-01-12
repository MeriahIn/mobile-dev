package com.horehoreteam.sewain_hackathon2023.packages

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.horehoreteam.sewain_hackathon2023.databinding.SubmittedPacketItemLayoutBinding
import com.horehoreteam.sewain_hackathon2023.model.ItemRequestPacket

class RequestChildChildAdapter (
    private val items:List<String>
): RecyclerView.Adapter<RequestChildChildAdapter.RequestChildChildViewHolder>() {
    class RequestChildChildViewHolder(val binding: SubmittedPacketItemLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RequestChildChildViewHolder {
        val binding = SubmittedPacketItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return RequestChildChildViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RequestChildChildViewHolder, position: Int) {
        val currItem = items[position]
        holder.apply {
            binding.apply {
                actvRequestHistoryName.text = currItem
            }
        }
    }

    override fun getItemCount() = items.size
}