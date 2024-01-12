package com.horehoreteam.sewain_hackathon2023.packages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.horehoreteam.sewain_hackathon2023.DataDummy
import com.horehoreteam.sewain_hackathon2023.R
import com.horehoreteam.sewain_hackathon2023.databinding.FragmentRequestBinding
import com.horehoreteam.sewain_hackathon2023.packages.adapter.MyPackageAdapter
import com.horehoreteam.sewain_hackathon2023.packages.adapter.RequestAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RequestFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RequestFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var _binding: FragmentRequestBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRequestBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = DataDummy.generateRequestPacket()
        val adapter = RequestPacketAdapter(data)
        binding.apply {
            rvRequest.adapter = adapter
            rvRequest.layoutManager = LinearLayoutManager(requireActivity())
        }

   /*     val listRequest = DataDummy.generateRequestPackage()
        val rvRequestRecent = binding.rvRequestRecent.apply {
            this.layoutManager = LinearLayoutManager(requireActivity())
        }
        val rvRequestWeek = binding.rvRequestWeek.apply {
            this.layoutManager = LinearLayoutManager(requireActivity())
        }
        val rvRequestMonth = binding.rvRequestMonth.apply {
            this.layoutManager = LinearLayoutManager(requireActivity())
        }
        
        rvRequestRecent.adapter = RequestAdapter(listRequest)
        rvRequestMonth.adapter = RequestAdapter(listRequest)
        rvRequestWeek.adapter = RequestAdapter(listRequest)*/
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}