package com.example.fastcampusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fastcampusandroid.models.CallItem
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)


        val callList = ArrayList<CallItem>()
        for(i in 0 until 10){
            callList.add(CallItem("$i 번째 사람", "$i 번째 번호"))
        }

        val adapter = RecyclerViewAdapter(callList, LayoutInflater.from(this@RecyclerViewActivity))

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this@RecyclerViewActivity)

    }
}


class RecyclerViewAdapter(val itemList : ArrayList<CallItem>,
              val inflater : LayoutInflater) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val name : TextView
        val phoneNum : TextView
        init{
            name = itemView.findViewById(R.id.name_txt)
            phoneNum = itemView.findViewById(R.id.phone_num_txt)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var view = inflater.inflate(R.layout.item_call, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = itemList[position].getName()
        holder.phoneNum.text = itemList[position].getPhoneNum()
    }

}