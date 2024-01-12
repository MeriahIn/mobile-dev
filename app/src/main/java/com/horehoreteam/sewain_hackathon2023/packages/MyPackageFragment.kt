package com.horehoreteam.sewain_hackathon2023.packages

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.horehoreteam.sewain_hackathon2023.DataDummy
import com.horehoreteam.sewain_hackathon2023.databinding.FragmentMyPackageBinding
import com.horehoreteam.sewain_hackathon2023.mainpage.adapter.NotificationAdapter
import com.horehoreteam.sewain_hackathon2023.packages.adapter.MyPackageAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MyPackageFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MyPackageFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var _binding: FragmentMyPackageBinding? = null
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
        _binding = FragmentMyPackageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.acivMypackageAddButton.setOnClickListener {
            val intent = Intent(requireActivity(), AddPackageActivity::class.java)
            startActivity(intent)
        }
        val listMyPackage = DataDummy.createMyPackageDataDummy()
        val rvMyPackage = binding.rvMyPackage.apply {
            this.layoutManager = LinearLayoutManager(requireActivity())
        }
        rvMyPackage.adapter = MyPackageAdapter(listMyPackage)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MyPackageFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MyPackageFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}