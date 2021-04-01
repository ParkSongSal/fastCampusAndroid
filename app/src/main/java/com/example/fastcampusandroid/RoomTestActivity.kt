package com.example.fastcampusandroid

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.fastcampusandroid.Room.UserDataBase
import com.example.fastcampusandroid.Room.Users

var db : UserDataBase? = null

var contactsList = mutableListOf<Users>()

class RoomTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_test)

        // 초기화
        db = UserDataBase.getInstance(applicationContext)




        /* TODO : Insert
        val contact = Users(0, "psm", "01050458326") //Contacts 생성
        db?.userDao()?.insertAll(contact) //DB에 추가
*/

        val savedContacts = db!!.userDao().getAllPerson()

        if (savedContacts != null) {
            if(savedContacts.isNotEmpty()){
                contactsList.addAll(savedContacts)
            }
        }



        Log.d("TAG","List : " + savedContacts.toString())

    }



}