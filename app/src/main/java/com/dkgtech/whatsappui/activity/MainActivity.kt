package com.dkgtech.whatsappui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.dkgtech.whatsappui.R
import com.dkgtech.whatsappui.adapter.FragmentDataAdapter
import com.dkgtech.whatsappui.databinding.ActivityMainBinding
import com.dkgtech.whatsappui.model.FragmentModel
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabDetails = ArrayList<FragmentModel>().apply {
            add(FragmentModel(R.drawable.status, "Status"))
            add(FragmentModel(R.drawable.call, "Calls"))
            add(FragmentModel(R.drawable.community, "Communities"))
            add(FragmentModel(R.drawable.chat, "Chats"))
            add(FragmentModel(R.drawable.settings, "Settings"))
        }

        binding.viewPager.adapter = FragmentDataAdapter(supportFragmentManager, lifecycle)

        binding.viewPager.currentItem = 3

        TabLayoutMediator(binding.tabLayout, binding.viewPager, object : TabConfigurationStrategy {
            override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                tab.text = tabDetails[position].title
                tab.icon = ResourcesCompat.getDrawable(resources, tabDetails[position].icon, null)
            }

        }).attach()
    }
}