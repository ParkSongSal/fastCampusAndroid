package com.example.fastcampusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_listener.*

var number = 10
class ListenerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)


        // 뷰를 activity로 가져오는 방법
        // 1) 직접 찾아서 가져온다.
        //val textView : TextView = findViewById(R.id.hello_txt)

        // 2) xmldmf Import해서 가져온다.
        hello_txt.text = "가나다라"


        // 익명함수 3 -> 2 -> 1 순으로 변화
        // 1) 람다방식
        hello_txt.setOnClickListener{
            Log.d("click", "Hello CLick!")
            hello_txt.text = "안녕하세요"
            gradient_img.setImageResource(R.drawable.board)
            number += 10
            Log.d("number", ""+ number)
        }

        // 2) 익명 함수 방식
//        hello_txt.setOnClickListener(object: View.OnClickListener{
//            override fun onClick(v: View?) {
//                Log.d("click", "Hello Click!!")
//            }
//        })
//
//        // 3) 이름이 필요한 경우(click)
//        val click = object : View.OnClickListener{
//            override fun onClick(v: View?) {
//
//            }
//        }
//        hello_txt.setOnClickListener(click)

        // 뷰를 조작하는 함수들
        //hello_txt.text = "안녕하세요"





    }
}