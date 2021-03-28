package com.example.fastcampusandroid

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent2.*

class IntentActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)


        resultBtn.setOnClickListener{

            val number1 = intent.getIntExtra("number1",0)
            val number2 = intent.getIntExtra("number2",0)

            Log.d("TAG","Intent2 number1 : $number1")
            Log.d("TAG","Intent2 number2 : $number2")

            val result = number1 + number2
            val resultIntent = Intent()
            resultIntent.apply {
                this.putExtra("result",result)
                setResult(Activity.RESULT_OK, resultIntent)
                finish()    // Stack에 쌓인 Activity 종료
            }

        }
    }
}