package com.example.fastcampusandroid

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
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
        listView.setOnItemClickListener{parent, view, position, id->
            val name = (adapter.getItem(position) as CallItem).getName()
            val phoneNum = (adapter.getItem(position) as CallItem).getPhoneNum()

            Toast.makeText(this@ListViewActivity, "$name / $phoneNum", Toast.LENGTH_SHORT).show()
        }
    }
}



class ListViewAdapter(
    val callForList : ArrayList<CallItem>,
    val context : Context
    ) : BaseAdapter(){



    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       /*
        1. 기본 방식 - findViewById로 인한 메모리 과부하로인하여 개선 필요
       val LayoutInflater = LayoutInflater.from(context)
        val view = LayoutInflater.inflate(R.layout.item_call, null)
        var nameTextView = view.findViewById<TextView>(R.id.name_txt)
        var phoneNumTextView = view.findViewById<TextView>(R.id.phone_num_txt)

        nameTextView.text = callForList.get(position).getName()
        phoneNumTextView.text = callForList.get(position).getPhoneNum()

        return view*/

        /*
        * 2. ViewHolder를 이용하여 findViewById 사용을 최소화
        * */
        val view : View
        val holder : ViewHolder
        val layoutInflater = LayoutInflater.from(context)
        if(convertView == null){
            view = layoutInflater.inflate(R.layout.item_call, null)
            holder = ViewHolder()

            holder.name = view.findViewById(R.id.name_txt)
            holder.phoneNum = view.findViewById(R.id.phone_num_txt)

            view.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            view = convertView
        }

        holder.name?.text = callForList.get(position).getName()
        holder.phoneNum?.text = callForList.get(position).getName()

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

class ViewHolder{
    var name : TextView? = null
    var phoneNum : TextView? = null
}