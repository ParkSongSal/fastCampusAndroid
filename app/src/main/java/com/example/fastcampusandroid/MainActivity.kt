package com.example.fastcampusandroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fastcampusandroid.adapters.MyAdapter
import com.example.fastcampusandroid.common.Common
import com.example.fastcampusandroid.models.ListItem

class MainActivity : AppCompatActivity() {

    private var mListView: ListView? = null

    private var mDataList = mutableListOf<ListItem>()
    private var mDataListBackup = mutableListOf<ListItem>()
    private var mAdapter: MyAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mListView = findViewById<ListView>(R.id.list_view)

        //데이터터
        mDataList = mutableListOf()
        addItem("1) firstText!!", "2021-03-19", fileTestActivity::class.java)
        addItem("2) Listener!!", "2021-03-21", ListenerActivity::class.java)
        addItem("3) Calculator", "2021-03-22", CalculatorActivity::class.java)
        addItem("4) Intent1", "2021-03-28", IntentActivity1::class.java)

        mAdapter = MyAdapter(mDataList)

        mDataListBackup = mutableListOf<ListItem>()

        mDataListBackup.addAll(mDataList)
        mListView?.adapter = mAdapter

        mAdapter!!.notifyDataSetChanged()

        //이벤트
        mListView?.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            val intent = Intent(applicationContext, mDataList[position].getCls())
            val common = Common()
            common.customToast(this@MainActivity, mDataList[position].getTitle().toString() + "로 이동!" )
            startActivity(intent)
        }



        Log.d("Life_Cycle", "onCrate!!!!!!!!!!!")
    }


    private fun addItem(title: String, date: String, cls: Class<*>) {
        val item = ListItem(title, date, cls)
        mDataList.add(item)
    }


    override fun onStart() {
        super.onStart()
        Log.d("Life_Cycle", "onStart!!!!!!!!")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Life_Cycle", "onResume!!!!!!!!")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Life_Cycle", "onPause!!!!!!!!")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Life_Cycle", "onStop!!!!!!!!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Life_Cycle", "onDestory!!!!!!!!")
    }
}