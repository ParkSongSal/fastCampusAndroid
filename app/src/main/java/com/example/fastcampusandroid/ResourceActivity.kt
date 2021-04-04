package com.example.fastcampusandroid

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_resource.*

class ResourceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        // resoucres 코드로 부르는 방법 1
        val ment = resources.getString(R.string.introTxt)
        Log.d("TAG","introTxt1 : $ment")

        // 방법2
        val ment2 = getString(R.string.introTxt)
        Log.d("TAG","introTxt2 : $ment")

        val color =if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            getColor(R.color.colorRed)
        }else{  // M(23) 버전보다 이하인 경우는 옛날 코드로 사용
            resources.getColor(R.color.colorRed)
        }
        Log.d("TAG","colorRed : $color")

        resourceTxt1

        resBtn.setOnClickListener{
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                resBtn.setBackgroundColor(getColor(R.color.colorAccent))
            }else{  // M(23) 버전보다 이하인 경우는 옛날 코드로 사용
                resBtn.setBackgroundColor(resources.getColor(R.color.colorAccent))
            }
        }
    }
}