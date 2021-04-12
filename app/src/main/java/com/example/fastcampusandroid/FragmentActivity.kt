package com.example.fastcampusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fastcampusandroid.Fragment.FragmentOne
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity(), FragmentOne.OnDataPassListener {


    override fun onDataPass(data: String?) {
        Log.d("TAG","" + data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val fragmentOne : FragmentOne = FragmentOne()

        //프래그먼트에 data를 넣어주는 방법
        val bundle = Bundle()
        bundle.putString("hello", "hello")
        fragmentOne.arguments = bundle


        //프래그먼트를 동적으로 추가하는 방법
        addFragBtn.setOnClickListener{
            //프래그먼트를 붙이는 방법 replace/add
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

        //프래그먼트를 제거하는 방법(detach)
        delFragBtn.setOnClickListener{
            // 프래그먼트 remove(다시 붙일수있음) / detach(다시 붙이지 못함) 하는 방법
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragmentOne)
            fragmentTransaction.commit()
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