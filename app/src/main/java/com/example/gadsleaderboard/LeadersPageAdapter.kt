package com.example.gadsleaderboard

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class LeadersPageAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm){

    private val fragments: ArrayList<Fragment> = ArrayList<Fragment>()
    private val titles: ArrayList<String> = ArrayList<String>()

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }


    fun addFragment(fragment: Fragment, title: String){
        fragments.add(fragment)
        titles.add(title)
    }

    fun getPageTitle(i: Int): CharSequence? {
        return titles[i]
    }
}