package com.horehoreteam.sewain_hackathon2023.mainpage.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.horehoreteam.sewain_hackathon2023.R
import com.horehoreteam.sewain_hackathon2023.ServicePageOwner2Activity
import com.horehoreteam.sewain_hackathon2023.databinding.HomeItemLayoutBinding
import com.horehoreteam.sewain_hackathon2023.model.ServicePreview

class ServicePreviewsAdapter(
    private val items:List<ServicePreview>
):RecyclerView.Adapter<ServicePreviewsAdapter.ServicePreviewViewHolder>() {
    class ServicePreviewViewHolder(val binding:HomeItemLayoutBinding):RecyclerView.ViewHolder(binding.root){
        init {
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, ServicePageOwner2Activity::class.java)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServicePreviewViewHolder {
        val binding = HomeItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ServicePreviewViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ServicePreviewViewHolder, position: Int) {
        val currItem = items[position]
        holder.apply {
            binding.apply {
                Glide.with(itemView.context)
                    .load(currItem.imageUrl)
                    .into(acivImage)
                actvName.text = currItem.name
                actvAdress.text = currItem.address
                actvRating.text = currItem.rating.toString()


            }
        }
    }

    override fun getItemCount() = items.size
}