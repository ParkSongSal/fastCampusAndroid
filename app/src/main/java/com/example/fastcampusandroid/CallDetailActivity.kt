package com.example.fastcampusandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_call_detail.*

class CallDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call_detail)

        val intent: Intent = intent


        detail_name.text = intent.getStringExtra("name")
        detail_phoneNum.text = intent.getStringExtra("phoneNum")
    }
}