package com.horehoreteam.sewain_hackathon2023.mainpage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.horehoreteam.sewain_hackathon2023.DataDummy
import com.horehoreteam.sewain_hackathon2023.catering.CateringActivity
import com.horehoreteam.sewain_hackathon2023.databinding.FragmentHomeBinding
import com.horehoreteam.sewain_hackathon2023.mainpage.adapter.ServicePreviewsAdapter
import com.horehoreteam.sewain_hackathon2023.mainpage.adapter.MyItemDecoration
import com.horehoreteam.sewain_hackathon2023.packages.PacketActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null
    private lateinit var itemDecoration: MyItemDecoration

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            llCatering.setOnClickListener {
                val intent = Intent(requireActivity(), CateringActivity::class.java)
                startActivity(intent)
            }
            llPacket.setOnClickListener {
                val intent = Intent(requireActivity(), PacketActivity::class.java)
                startActivity(intent)
            }

        }

        setUpAdapters()
    }

    private fun setUpAdapters() {
        lifecycleScope.launch(Dispatchers.Main){
            binding?.apply {
                itemDecoration = MyItemDecoration(
                    resources.displayMetrics,
                    paddingEnd = 16
                )

                val cateringAdapter:ServicePreviewsAdapter = async(Dispatchers.Default) {ServicePreviewsAdapter(DataDummy.createServiceCatering()) }.await()
                val wardrobeAdapter:ServicePreviewsAdapter = async(Dispatchers.Default) { ServicePreviewsAdapter(DataDummy.createServiceWardobe()) }.await()
                val decorationAdapter:ServicePreviewsAdapter = async (Dispatchers.Default){ ServicePreviewsAdapter(DataDummy.createServiceDekorasi()) }.await()
                val packetAdapter:ServicePreviewsAdapter = async(Dispatchers.Default) { ServicePreviewsAdapter(DataDummy.createServicePaket()) }.await()


                rvCatering.layoutManager =
                    LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
                rvWardrobe.layoutManager =
                    LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
                rvDecoration.layoutManager =
                    LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
                rvPacket.layoutManager =
                    LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)

                rvCatering.addItemDecoration(itemDecoration)
                rvWardrobe.addItemDecoration(itemDecoration)
                rvDecoration.addItemDecoration(itemDecoration)
                rvPacket.addItemDecoration(itemDecoration)

                rvCatering.adapter = cateringAdapter
                rvWardrobe.adapter = wardrobeAdapter
                rvDecoration.adapter = decorationAdapter
                rvPacket.adapter = packetAdapter
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}