package com.horehoreteam.sewain_hackathon2023.packages.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.horehoreteam.sewain_hackathon2023.R
import com.horehoreteam.sewain_hackathon2023.model.HistoryPackage

class HistoryAdapter(private val requestPackage: List<HistoryPackage>) :
    RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {
    class HistoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvOrderId: TextView
        val userName: TextView
        val serviceName: TextView
        val listOne: TextView
        val listTwo: TextView
        val listThree: TextView
        val statusListOne: TextView
        val statusListTwo: TextView
        val statusListThree: TextView
        val userPhoto: ImageView

        init {
            tvOrderId = view.findViewById(R.id.actv_request_history_order_id)
            userName = view.findViewById(R.id.actv_request_history_user_name)
            serviceName = view.findViewById(R.id.actv_request_history_service_ordered)
            listOne = view.findViewById(R.id.actv_request_history_item1)
            listTwo = view.findViewById(R.id.actv_request_history_item2)
            listThree = view.findViewById(R.id.actv_request_history_item3)
            statusListOne = view.findViewById(R.id.actv_history_item1_status)
            statusListTwo = view.findViewById(R.id.actv_history_item2_status)
            statusListThree = view.findViewById(R.id.actv_history_item3_status)
            userPhoto = view.findViewById(R.id.civ_request_history_profile_picture)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.request_card_layout, parent, false)

        return HistoryViewHolder(view)
    }

    override fun getItemCount(): Int = requestPackage.size

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.tvOrderId.text = requestPackage[position].orderId
        holder.userName.text = requestPackage[position].userName
        holder.serviceName.text = requestPackage[position].serviceName
        holder.listOne.text = requestPackage[position].listOne
        holder.listTwo.text = requestPackage[position].listTwo
        holder.listThree.text = requestPackage[position].listThree
        holder.statusListOne.text = requestPackage[position].statuslistOne
        holder.statusListTwo.text = requestPackage[position].statuslistTwo
        holder.statusListThree.text = requestPackage[position].statuslistThree
        Glide.with(holder.userPhoto.context).load(requestPackage[position].imgUrl)
            .into(holder.userPhoto)

        val color1 = if (requestPackage[position].statuslistOne == "Ditolak") {
            R.color.red
        } else R.color.green
        val color2 = if (requestPackage[position].statuslistTwo == "Ditolak") {
            R.color.red
        } else R.color.green
        val color3 = if (requestPackage[position].statuslistThree == "Ditolak") {
            R.color.red
        } else R.color.green

        holder.statusListOne.setBackgroundColor(holder.itemView.resources.getColor(color1, null))
        holder.statusListTwo.setBackgroundColor(holder.itemView.resources.getColor(color2, null))
        holder.statusListThree.setBackgroundColor(holder.itemView.resources.getColor(color3, null))
    }
}