package com.example.fastcampusandroid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_test.*

class IntentTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_test)

        openUrlBtn.setOnClickListener{

            val urlTxt = urlEdit.text.toString()
            val urlIntent = Intent(Intent.ACTION_VIEW, Uri.parse(urlTxt))
            startActivity(urlIntent)
        }
    }
}