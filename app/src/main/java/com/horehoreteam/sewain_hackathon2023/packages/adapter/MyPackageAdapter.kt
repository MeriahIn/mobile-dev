package com.horehoreteam.sewain_hackathon2023.packages.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.horehoreteam.sewain_hackathon2023.R
import com.horehoreteam.sewain_hackathon2023.model.Packages
import com.horehoreteam.sewain_hackathon2023.packages.PackagePageActivity

class MyPackageAdapter(private val listPackages: List<Packages>) :
    RecyclerView.Adapter<MyPackageAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView
        val subtitle: TextView
        val foodServiceCount: TextView
        val wardrobeServiceCount: TextView
        val decorationServiceCount: TextView
        val imageService: ImageView

        init {
            title = view.findViewById(R.id.actv_package_title)
            subtitle = view.findViewById(R.id.actv_package_subtitle)
            foodServiceCount = view.findViewById(R.id.actv_package_food_service)
            wardrobeServiceCount = view.findViewById(R.id.actv_package_wardrobe_service)
            decorationServiceCount = view.findViewById(R.id.actv_package_decoration_service)
            imageService = view.findViewById(R.id.aciv_package_image)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, PackagePageActivity::class.java)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.package_card_layout, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listPackages.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = listPackages[position].title
        holder.subtitle.text = listPackages[position].subtitle
        holder.foodServiceCount.text = listPackages[position].foodServiceCount
        holder.wardrobeServiceCount.text = listPackages[position].wardrobeServiceCount
        holder.decorationServiceCount.text = listPackages[position].decorationServiceCount
        Glide.with(holder.imageService.context).load(listPackages[position].imageService).into(holder.imageService)
    }

}