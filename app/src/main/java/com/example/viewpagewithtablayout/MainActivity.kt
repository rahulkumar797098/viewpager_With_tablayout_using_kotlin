package com.example.viewpagewithtablayout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager.widget.ViewPager
import com.example.viewpagewithtablayout.adapter.DashboardAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

     var tabLayout: TabLayout? = null
    var viewPager : ViewPager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewpagerId)



         viewPager!!.adapter = DashboardAdapter(this,supportFragmentManager)
        tabLayout!!.setupWithViewPager(viewPager)

    }
}



// now we solve this error



