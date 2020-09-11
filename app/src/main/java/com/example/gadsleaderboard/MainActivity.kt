package com.example.gadsleaderboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : FragmentActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val leadersPageAdapter = LeadersPageAdapter(this)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.pager)

        leadersPageAdapter.addFragment(LearningLeadersFragment(), "Learning Leaders")
        leadersPageAdapter.addFragment(SkillIQFragment(), "Skill IQ Leaders")

        viewPager.adapter = leadersPageAdapter
        TabLayoutMediator(tabLayout, viewPager){tab, position ->
            tab.text = leadersPageAdapter.getPageTitle(position)
            viewPager.setCurrentItem(tab.position, true)
        }.attach()
    }
}