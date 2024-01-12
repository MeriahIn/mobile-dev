package com.horehoreteam.sewain_hackathon2023.packages

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.horehoreteam.sewain_hackathon2023.databinding.ItemRequestLayoutBinding
import com.horehoreteam.sewain_hackathon2023.mainpage.adapter.MyItemDecoration
import com.horehoreteam.sewain_hackathon2023.model.HistoryPacket
import com.horehoreteam.sewain_hackathon2023.model.RequestPacket

class RequestPacketStatusAdapter  (
    private val items:List<HistoryPacket>
): RecyclerView.Adapter<RequestPacketStatusAdapter.RequestViewHolder>() {
    class RequestViewHolder(val binding: ItemRequestLayoutBinding): RecyclerView.ViewHolder(binding.root){
        init {
            binding.rvChild.addItemDecoration(
                MyItemDecoration(
                    itemView.context.resources.displayMetrics,
                    paddingBottom = 8
                )
            )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RequestViewHolder {
        val binding = ItemRequestLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return RequestViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RequestViewHolder, position: Int) {
        val currItem = items[position]
        holder.apply {
            binding.apply {
                this.actvTime.text = currItem.time
                rvChild.adapter = RequestChildStatusAdapter(currItem.requestItems)
                rvChild.layoutManager = LinearLayoutManager(itemView.context)
            }
        }
    }

    override fun getItemCount() = items.size
}