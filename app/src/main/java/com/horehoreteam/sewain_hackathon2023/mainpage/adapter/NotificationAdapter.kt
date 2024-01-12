package com.horehoreteam.sewain_hackathon2023.mainpage.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.horehoreteam.sewain_hackathon2023.R
import com.horehoreteam.sewain_hackathon2023.model.Notification

class NotificationAdapter(private val listMessage: List<Notification>) :
    RecyclerView.Adapter<NotificationAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val message: AppCompatTextView

        init {
            message = view.findViewById(R.id.actv_notification_message)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.notification_item_notification_layout, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.message.text = listMessage[position].message
    }

    override fun getItemCount(): Int = listMessage.size
}