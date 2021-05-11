package com.example.fastcampusandroid

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.fastcampusandroid.adapters.CallAdapter
import com.example.fastcampusandroid.common.Common
import com.example.fastcampusandroid.models.CallItem
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

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

    @Subscribe
    fun onItemClick(event: CallAdapter.ItemClickEvent) {

        val intent = Intent(applicationContext, CallDetailActivity::class.java)
            intent.putExtra("name", mDataList[event.position].getName())
            intent.putExtra("phoneNum", mDataList[event.position].getPhoneNum())

        startActivity(intent)
    }


    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }


}