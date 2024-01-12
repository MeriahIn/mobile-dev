package com.horehoreteam.sewain_hackathon2023.packages

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.horehoreteam.sewain_hackathon2023.databinding.ItemRequestChildLayoutBinding
import com.horehoreteam.sewain_hackathon2023.model.ItemHistoryPacket
import com.horehoreteam.sewain_hackathon2023.model.ItemRequestPacket
import com.horehoreteam.sewain_hackathon2023.model.RequestPacket

class RequestChildStatusAdapter (
    private val items:List<ItemHistoryPacket>
): RecyclerView.Adapter<RequestChildStatusAdapter.RequestChildViewHolder>() {
    class RequestChildViewHolder(val binding: ItemRequestChildLayoutBinding): RecyclerView.ViewHolder(binding.root){
        init {
            binding.acivRequestHistoryCollapseButton.isActivated = false
            binding.acivRequestHistoryCollapseButton.setOnClickListener {
                val newState = !binding.acivRequestHistoryCollapseButton.isActivated
                binding.acivRequestHistoryCollapseButton.isActivated = newState
                binding.clExtent.isVisible = newState
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RequestChildViewHolder {
        val binding = ItemRequestChildLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return RequestChildViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RequestChildViewHolder, position: Int) {
        val currItem = items[position]
        holder.apply {
            binding.apply {
                this.actvRequestHistoryOrderId.text = currItem.requestId
                Glide.with(itemView.context)
                    .load(currItem.imageUrl)
                    .into(civRequestHistoryProfilePicture)
                actvRequestHistoryServiceOrdered.text = currItem.packetName
                actvRequestHistoryUserName.text = currItem.userName

                if (currItem.submittedCaterings.isNotEmpty()){
                    actvCateringInfo.isVisible = true
                    rvSubmittedCaterings.adapter = RequestChildChildStatusAdaptere(currItem.submittedCaterings)
                    rvSubmittedCaterings.layoutManager = LinearLayoutManager(itemView.context)
                }else actvCateringInfo.isVisible = false

                if (currItem.submittedWardrobes.isNotEmpty()){
                    actvWardrobeInfo.isVisible = true
                    rvSubmittedWardrobe.adapter = RequestChildChildStatusAdaptere(currItem.submittedWardrobes)
                    rvSubmittedWardrobe.layoutManager = LinearLayoutManager(itemView.context)
                }else actvWardrobeInfo.isVisible = false

                if (currItem.submittedDecoration.isNotEmpty()){
                    actvDecorationInfo.isVisible = true
                    rvSubmittedDecoration.adapter = RequestChildChildStatusAdaptere(currItem.submittedDecoration)
                    rvSubmittedDecoration.layoutManager = LinearLayoutManager(itemView.context)
                }else {

                    rvSubmittedDecoration.isVisible = true
                }


            }
        }
    }

    override fun getItemCount() = items.size
}