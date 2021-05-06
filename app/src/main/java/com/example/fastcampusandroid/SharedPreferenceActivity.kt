package com.example.fastcampusandroid

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)




        /*
        * Mode
        * - MODE_PRIVATE : 생성한 Application에서만 사용 가능
        * - MODE_WORLD_READABLE : 다른 Application에서 사용 가능 -> 읽을수만 있다.
        * - MODE_WORLD_WRITEABLE : 다른 Application에서 사용 가능 -> 쓰기도 가능
        * - MODE_MULTI_PROCESS : 이미 호출되어 사용중인지 체크
        * - MODE_APPEND : 기존 preference에 신규로 추가
        * */

        // sp1 -> SharedPreference
        //      (Key, Value) -> ("Hello", "안녕하세요")
        // sp2 -> SharedPreference
        //      (Key, Value) -> ("Hello", "안녕하세요11)

        // 저장
        saveBtn.setOnClickListener{
            // SharedPreference에 저장하는 방법
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.putString("hello","안녕하세요")
            editor.putString("goodbye","안녕히가세여")
            editor.commit()
        }

        // 불러오기
        sharedBtn.setOnClickListener{
            // SharedPreference 에 저장된 값을 불러오는 방법
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val hello = sharedPreference.getString("hello","hi")
            val bye = sharedPreference.getString("goodbye","bye")
            Log.d("TAG","hello Value: $hello")
            Log.d("TAG","bye Value: $bye")
        }

        //부분삭제
        delBtn.setOnClickListener{
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.remove("hello") // 해당 키만 삭제
            editor.commit()
        }

        //전체삭제
        allDelBtn.setOnClickListener{
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.clear()  // 저장된 데이터 전체 삭제
            editor.commit()
        }


    }
}