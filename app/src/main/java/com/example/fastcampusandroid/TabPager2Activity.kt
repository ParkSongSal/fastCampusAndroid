package com.example.fastcampusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_tab_pager.tabLayout
import kotlinx.android.synthetic.main.activity_tab_pager.viewPager

class TabPager2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_pager2)


        tabLayout.addTab(tabLayout.newTab().setText("One"))
        tabLayout.addTab(tabLayout.newTab().setText("Two"))
        tabLayout.addTab(tabLayout.newTab().setText("Three"))

        val adpter = ThreePageAdapter(LayoutInflater.from(this@TabPager2Activity))
        viewPager.adapter = adpter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
            }
        })

        // 페이지가 이동했을때 탭을 이동시키는 코드
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

    }
}


class ThreePageAdapter(
    val layoutInflater : LayoutInflater
): PagerAdapter(){


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as View
    }

    // Pager의 개수
    override fun getCount(): Int {
       return 3
    }

    //
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        when(position){
            0->{
                val view = layoutInflater.inflate(R.layout.fragment_one, container, false)
                container.addView(view)
                return view
            }
            1->{
                val view = layoutInflater.inflate(R.layout.fragment_two, container, false)
                container.addView(view)
                return view
            }
            2->{
                val view = layoutInflater.inflate(R.layout.fragment_three, container, false)
                container.addView(view)
                return view
            }
            else->{
                val view = layoutInflater.inflate(R.layout.fragment_one, container, false)
                container.addView(view)
                return view
            }
        }
    }
}