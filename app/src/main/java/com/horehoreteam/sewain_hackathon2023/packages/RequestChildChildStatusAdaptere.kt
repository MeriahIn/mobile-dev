package com.horehoreteam.sewain_hackathon2023.packages

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.horehoreteam.sewain_hackathon2023.databinding.SubmittenPacketStatusItemLayoutBinding
import com.horehoreteam.sewain_hackathon2023.model.SubmittedItem

class RequestChildChildStatusAdaptere (
    private val items:List<SubmittedItem>
): RecyclerView.Adapter<RequestChildChildStatusAdaptere.RequestChildChildViewHolder>() {
    class RequestChildChildViewHolder(val binding: SubmittenPacketStatusItemLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RequestChildChildViewHolder {
        val binding = SubmittenPacketStatusItemLayoutBinding.inflate(
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
                actvRequestHistoryName.text = currItem.serviceName
                actvRequestHistoryNameAccept.isVisible = currItem.isAccepted
                actvRequestHistoryNameReject.isVisible = !currItem.isAccepted
            }
        }
    }

    override fun getItemCount() = items.size
}