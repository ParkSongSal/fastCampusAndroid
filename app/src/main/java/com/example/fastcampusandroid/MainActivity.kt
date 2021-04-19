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
        addItem("5) IntentTest(OpenUrl)", "2021-03-29", IntentTestActivity::class.java)
        addItem("6) Room 라이브러리", "2021-03-31", RoomTestActivity::class.java)
        addItem("7) Fragment", "2021-04-01", FragmentActivity::class.java)
        addItem("8) NullSafety", "2021-04-04", NullSafetyActivity::class.java)
        addItem("9) Resoucre", "2021-04-04", ResourceActivity::class.java)
        addItem("10) Context", "2021-04-05", ContextActivity::class.java)
        addItem("11) Thread", "2021-04-05", ThreadActivity::class.java)
        addItem("12) Glide Lib", "2021-04-07", GlideLibActivity::class.java)
        addItem("13) addView", "2021-04-07", addViewActivity::class.java)
        addItem("14) 전화번호부", "2021-04-14", CallListActivity::class.java)
        addItem("15) ListView", "2021-04-19", ListViewActivity::class.java)

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