package com.horehoreteam.sewain_hackathon2023.packages.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.horehoreteam.sewain_hackathon2023.R
import com.horehoreteam.sewain_hackathon2023.model.RequestPackage

class RequestAdapter(private val requestPackage: List<RequestPackage>) :
    RecyclerView.Adapter<RequestAdapter.RequestViewHolder>() {
    class RequestViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvOrderId: TextView
        val userName: TextView
        val serviceName: TextView
        val listOne: TextView
        val listTwo: TextView
        val listThree: TextView
        val userPhoto: ImageView

        init {
            tvOrderId = view.findViewById(R.id.actv_request_history_order_id)
            userName = view.findViewById(R.id.actv_request_history_user_name)
            serviceName = view.findViewById(R.id.actv_request_history_service_ordered)
            listOne = view.findViewById(R.id.actv_request_history_item1)
            listTwo = view.findViewById(R.id.actv_request_history_item2)
            listThree = view.findViewById(R.id.actv_request_history_item3)
            userPhoto = view.findViewById(R.id.civ_request_history_profile_picture)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RequestViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.request_card_layout, parent, false)

        return RequestViewHolder(view)
    }

    override fun getItemCount(): Int = requestPackage.size

    override fun onBindViewHolder(holder: RequestViewHolder, position: Int) {
        holder.tvOrderId.text = requestPackage[position].orderId
        holder.userName.text = requestPackage[position].userName
        holder.serviceName.text = requestPackage[position].serviceName
        holder.listOne.text = requestPackage[position].listOne
        holder.listTwo.text = requestPackage[position].listTwo
        holder.listThree.text = requestPackage[position].listThree
        Glide.with(holder.userPhoto.context).load(requestPackage[position].imgUrl)
            .into(holder.userPhoto)
    }
}