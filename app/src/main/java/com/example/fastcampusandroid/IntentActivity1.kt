package com.example.fastcampusandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent1.*

class IntentActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent1)


        change_Intent.setOnClickListener{
          /*  val intent = Intent(this, IntentActivity2::class.java)

            // Dictionary(Key, Value 방식) -> Key와 value를 쌍으로 만들어 저장한다.
            intent.putExtra("number1", 1)
            intent.putExtra("number2", 2)
            startActivity(intent)
        */
            val intent2 = Intent(this@IntentActivity1, IntentActivity2::class.java)
            // Apply ->
            intent2.apply{
                this.putExtra("number1", 1)
                this.putExtra("number2",2)
            }
            startActivityForResult(intent2,200)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.d("TAG","requestCode : $requestCode")
        Log.d("TAG","resultCode : $resultCode")
        Log.d("TAG","data : ${data.toString()}")

        if(requestCode == 200){
            val result = data?.getIntExtra("result",0)
            Log.d("TAG","result : $result" )
        }else{
            Log.d("TAG","Failed" )
        }
    }
}