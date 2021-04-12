package com.example.fastcampusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_thread.*

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)



        // 쓰레드 사용 방법 1
        val runnable : Runnable = object : Runnable{
            override fun run() {
                Log.d("TAG"," thread-1 is made")
            }
        }
        val thread : Thread = Thread(runnable)

        threadBtn.setOnClickListener{
            thread.start()
        }

        // 쓰레드 사용 방법 2
        Thread(object : Runnable{
            override fun run() {
                Log.d("TAG"," thread-2 is made")
            }
        }).start()

        // 쓰레드 사용 방법 3 람다 방식
        Thread(Runnable {
            Log.d("TAG"," thread-3 is made")
            Thread.sleep(2000)
            runOnUiThread { // android의 ui를 수정해야 하는 경우
                threadBtn.setBackgroundColor(getColor(R.color.colorRed))
            }
        }).start()



    }
}