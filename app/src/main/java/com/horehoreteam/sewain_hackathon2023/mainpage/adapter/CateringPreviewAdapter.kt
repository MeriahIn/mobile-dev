package com.horehoreteam.sewain_hackathon2023.mainpage.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.horehoreteam.sewain_hackathon2023.databinding.CateringItemLayoutBinding
import com.horehoreteam.sewain_hackathon2023.model.CateringPreview
import com.horehoreteam.sewain_hackathon2023.services.ServicePageOwnerActivity

class CateringPreviewAdapter(
    private val items:List<CateringPreview>
): RecyclerView.Adapter<CateringPreviewAdapter.CateringVH>() {
    class CateringVH(val binding: CateringItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){
        init {
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, ServicePageOwnerActivity::class.java)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CateringVH {
        val binding = CateringItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CateringVH(binding)
    }

    override fun onBindViewHolder(holder: CateringVH, position: Int) {
        val currItem = items[position]
        holder.apply {
            binding.apply {
                Glide.with(itemView.context)
                    .load(currItem.imageUrl)
                    .into(acivServiceImage)
                actvServiceName.text = currItem.name
                actvPrice.text = currItem.price
                actvRating.text = currItem.rating
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}