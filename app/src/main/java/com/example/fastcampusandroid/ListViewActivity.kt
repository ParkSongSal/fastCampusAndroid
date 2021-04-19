package com.example.fastcampusandroid

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.fastcampusandroid.models.CallItem
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val callList = ArrayList<CallItem>()
        for(i in 0 until 10){
            callList.add(CallItem("$i 번째 사람", "$i 번째 번호"))
        }

        val adapter = ListViewAdapter(callList, this@ListViewActivity)
        listView.adapter = adapter

    }
}



class ListViewAdapter(
    val callForList : ArrayList<CallItem>,
    val context : Context
    ) : BaseAdapter(){



    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val LayoutInflater = LayoutInflater.from(context)
        val view = LayoutInflater.inflate(R.layout.item_call, null)
        var nameTextView = view.findViewById<TextView>(R.id.name_txt)
        var phoneNumTextView = view.findViewById<TextView>(R.id.phone_num_txt)

        nameTextView.text = callForList.get(position).getName()
        phoneNumTextView.text = callForList.get(position).getPhoneNum()

        return view
    }

    // 그리고자 하는 아이템 리스트의 하나(포지션에 해당하는)
    override fun getItem(position: Int): Any {
        return callForList[position]
    }

    // 해당 포지션에 위치해 있는 아이템의 아이디
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    // 그리고자 하는 아이템 리스트의 전체 개수
    override fun getCount(): Int {
        return callForList.size
    }

}