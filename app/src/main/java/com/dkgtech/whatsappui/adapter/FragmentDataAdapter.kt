package com.dkgtech.whatsappui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dkgtech.whatsappui.fragment.CallsFragment
import com.dkgtech.whatsappui.fragment.ChatsFragment
import com.dkgtech.whatsappui.fragment.CommunitiesFragment
import com.dkgtech.whatsappui.fragment.SettingsFragment
import com.dkgtech.whatsappui.fragment.StatusFragment

class FragmentDataAdapter(private val fm: FragmentManager, private val lifecycle: Lifecycle) :
    FragmentStateAdapter(fm, lifecycle) {
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                StatusFragment()
            }

            1 -> {
                CallsFragment()
            }

            2 -> {
                CommunitiesFragment()
            }

            3 -> {
                ChatsFragment()
            }

            else -> SettingsFragment()
        }
    }
}