package com.example.fastcampusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fastcampusandroid.Fragment.FragmentOne
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        //프래그먼트를 동적으로 추가하는 방법
        addFragBtn.setOnClickListener{
            val fragmentOne : FragmentOne = FragmentOne()
            val fragmentManager = supportFragmentManager

            // Transaction -> 작업의 단위 -> 시작과 끝이 있다.
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragmentOne)
            fragmentTransaction.commit()
            /* 끝을 내는 방법
            * 1. commit -> 시간될 때해!! (좀더 안정적)
            * 2. commitNow -> 지금 당장 해!
            * 3. commitAllowingStateLoss -> 잘 사용안함.
            * */

        }

        Log.d("Life_Cycle", "onCreate!!!!!!!!")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Life_Cycle", "onStart!!!!!!!!")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Life_Cycle", "onResume!!!!!!!!")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Life_Cycle", "onPause!!!!!!!!")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Life_Cycle", "onStop!!!!!!!!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Life_Cycle", "onDestory!!!!!!!!")
    }
}