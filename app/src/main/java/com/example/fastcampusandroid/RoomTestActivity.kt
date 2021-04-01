package com.example.fastcampusandroid

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fastcampusandroid.Room.UserDataBase
import com.example.fastcampusandroid.Room.Users
import com.example.fastcampusandroid.Room.Users2
import com.example.fastcampusandroid.adapters.UsersAdapter
import com.example.fastcampusandroid.common.Common
import kotlinx.android.synthetic.main.activity_room_test.*

var db : UserDataBase? = null

var userNickName : String = ""
var userPhone : String = ""
var usersList = mutableListOf<Users>()

private var mAdapter: UsersAdapter? = null

val common = Common()

class RoomTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_test)

        // 초기화
        db = UserDataBase.getInstance(applicationContext)
        usersList = mutableListOf<Users>()
        getList()


        add_btn.setOnClickListener{
            userNickName = edit_txt.text.toString()
            userPhone = "010-5545-3823"

            val user = Users(0, userNickName, userPhone, common.nowDate())

            usersList.add(user)

            mAdapter = UsersAdapter(applicationContext, usersList)

            //mCustomAdapter.notifyDataSetChanged();
            mRecyclerView.adapter = mAdapter

            Log.d("TAG", "새로 추가했을 떄!! =========>$usersList");

        }

        save_btn.setOnClickListener{

            val getRows: Int = getNumFiles()
            Log.d(
                "TAG",
                "새로 추가했을 떄!! checkList 갯수=========>" + usersList.size
            ) //3     개수는 3개  포지션은 0,1,2

            Log.d("TAG", "새로 추가했을 떄!! DB에 저장된 row갯수=========>$getRows") //0


            for (i in getRows until usersList.size) {
                if (usersList.size > getRows) {
                    db?.userDao()?.insertAll(Users(0, usersList[i].NickName, usersList[i].PhoneNum, common.nowDate()))
                    Log.d("TAG", "Save ===========> " + i + " 번째 " + usersList[i].toString())
                } else {
                    Log.d("TAG", "Break!!! ===========>")
                    break
                }
            }

            Toast.makeText(this@RoomTestActivity, "저장되었습니다.", Toast.LENGTH_SHORT).show()

        }



    }

    fun getNumFiles(): Int {
        return db?.userDao()?.getCount()!!
    }

    fun getList(){
        val savedContacts = db!!.userDao().getAllPerson()

        if (savedContacts != null) {
            if(savedContacts.isNotEmpty()){
                usersList.addAll(savedContacts)
                mAdapter = UsersAdapter(applicationContext, usersList)
                mRecyclerView.adapter = mAdapter
                mAdapter!!.notifyDataSetChanged()
            }
        }
        Log.d("TAG", "List : " + savedContacts.toString())
    }

}