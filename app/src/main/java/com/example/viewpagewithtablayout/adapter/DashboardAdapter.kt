package com.example.viewpagewithtablayout.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagewithtablayout.fragment.HomeFragment
import com.example.viewpagewithtablayout.fragment.SearchFragment
import com.example.viewpagewithtablayout.fragment.UserFragment

class DashboardAdapter(private val context: Context , fragmentManager: FragmentManager ) : FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
      return when(position){
           0-> HomeFragment()
           1 -> SearchFragment()
           else -> UserFragment()
       }
    }
// here we set title
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "HOME"
            1 -> "SEARCH"
            else -> "USER"
        }
    }

}