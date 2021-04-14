package com.example.fastcampusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import com.example.fastcampusandroid.adapters.CallAdapter
import com.example.fastcampusandroid.adapters.MyAdapter
import com.example.fastcampusandroid.models.CallItem
import com.example.fastcampusandroid.models.ListItem
import kotlinx.android.synthetic.main.activity_room_test.*

class CallListActivity : AppCompatActivity() {

    private var mCallRecyclerView: RecyclerView? = null

    private var mDataList = mutableListOf<CallItem>()
    private var mDataListBackup = mutableListOf<CallItem>()
    private var mAdapter: CallAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call_list)

        mCallRecyclerView = findViewById(R.id.mCallRecyclerView)

        mDataList = mutableListOf()

        addItem("둥이","010-3165-1771")
        addItem("아빠","010-3785-8326")
        addItem("엄마","010-2086-8326")


        mAdapter = CallAdapter(applicationContext, mDataList)

        mDataListBackup = mutableListOf()

        mDataListBackup.addAll(mDataList)

        mCallRecyclerView?.adapter = mAdapter

        mAdapter!!.notifyDataSetChanged()





    }

    private fun addItem(name: String, phoneNum: String) {
        val item = CallItem(name, phoneNum)
        mDataList.add(item)
    }

}