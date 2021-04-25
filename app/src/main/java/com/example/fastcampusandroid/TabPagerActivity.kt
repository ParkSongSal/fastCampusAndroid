package com.example.fastcampusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.fastcampusandroid.Fragment.Fragment1
import com.example.fastcampusandroid.Fragment.Fragment2
import com.example.fastcampusandroid.Fragment.Fragment3
import com.example.fastcampusandroid.Fragment.FragmentOne
import kotlinx.android.synthetic.main.activity_tab_pager.*

class TabPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_pager)

        tabLayout.addTab(tabLayout.newTab().setText("One"))
        tabLayout.addTab(tabLayout.newTab().setText("Two"))
        tabLayout.addTab(tabLayout.newTab().setText("Three"))

    }
}

class PagerAdapter(
    fragmentManager: FragmentManager,
    val tabCount: Int
): FragmentStatePagerAdapter(fragmentManager){

    override fun getItem(position: Int): Fragment {
        when(position){
            0->{
                return Fragment1()
            }
            1->{
                return Fragment2()
            }
            2->{
                return Fragment3()
            }
            else-> return Fragment1()
        }
    }

    override fun getCount(): Int {
        return tabCount
    }

}