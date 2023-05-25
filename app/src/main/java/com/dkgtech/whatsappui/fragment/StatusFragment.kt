package com.dkgtech.whatsappui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.dkgtech.whatsappui.R
import com.dkgtech.whatsappui.adapter.RecyclerStatusAdapter
import com.dkgtech.whatsappui.databinding.FragmentStatusBinding
import com.dkgtech.whatsappui.model.StatusModel

class StatusFragment : Fragment() {
    private lateinit var binding: FragmentStatusBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentStatusBinding.inflate(inflater, container, false)

        val arrStatus = ArrayList<StatusModel>().apply {
            add(StatusModel(R.drawable.user_1, "Dipesh", "10:30"))
            add(StatusModel(R.drawable.user_2, "Saurabh", "11:05 AM"))
            add(StatusModel(R.drawable.user_3, "Ankita", "12:05 PM"))
            add(StatusModel(R.drawable.user_4, "Omkar", "01:30 PM"))
            add(StatusModel(R.drawable.user_5, "Radhika", "11:05 AM"))
            add(StatusModel(R.drawable.user_6, "Aadarsh", "12:05 PM"))
            add(StatusModel(R.drawable.user_7, "Prasad", "01:30 PM"))
            add(StatusModel(R.drawable.user_8, "Pranit", "11:05 AM"))
            add(StatusModel(R.drawable.user_9, "Akshay", "12:05 PM"))
            add(StatusModel(R.drawable.user_10, "Uttam", "11:05 AM"))
            add(StatusModel(R.drawable.user_11, "Prafull", "12:05 PM"))

            add(StatusModel(R.drawable.user_1, "Dipesh", "10:30"))
            add(StatusModel(R.drawable.user_2, "Saurabh", "11:05 AM"))
            add(StatusModel(R.drawable.user_3, "Ankita", "12:05 PM"))
            add(StatusModel(R.drawable.user_4, "Omkar", "01:30 PM"))
            add(StatusModel(R.drawable.user_5, "Radhika", "11:05 AM"))
            add(StatusModel(R.drawable.user_6, "Aadarsh", "12:05 PM"))
            add(StatusModel(R.drawable.user_7, "Prasad", "01:30 PM"))
            add(StatusModel(R.drawable.user_8, "Pranit", "11:05 AM"))
            add(StatusModel(R.drawable.user_9, "Akshay", "12:05 PM"))
            add(StatusModel(R.drawable.user_10, "Uttam", "11:05 AM"))
            add(StatusModel(R.drawable.user_11, "Prafull", "12:05 PM"))
        }

        binding.statusRecyclerView.layoutManager = LinearLayoutManager(context)

        binding.statusRecyclerView.adapter = context?.let { RecyclerStatusAdapter(it, arrStatus) }

        return binding.root
    }

}