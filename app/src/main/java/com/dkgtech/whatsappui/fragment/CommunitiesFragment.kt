package com.dkgtech.whatsappui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dkgtech.whatsappui.R
import com.dkgtech.whatsappui.databinding.FragmentCommunitiesBinding


class CommunitiesFragment : Fragment() {

    private lateinit var binding: FragmentCommunitiesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCommunitiesBinding.inflate(inflater, container, false)
        return binding.root
    }

}