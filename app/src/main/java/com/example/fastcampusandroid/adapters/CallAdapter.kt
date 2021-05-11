package com.example.fastcampusandroid.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fastcampusandroid.R
import com.example.fastcampusandroid.models.CallItem
import org.greenrobot.eventbus.EventBus

class CallAdapter() : RecyclerView.Adapter<CallAdapter.ViewHolder>(){

    var callList : MutableList<CallItem>? = null
    var mContext : Context? = null


    constructor(context: Context, callList: MutableList<CallItem>) : this() {
        this.callList = callList
        mContext = context
    }

    //Event Bus 클래스
    class ItemClickEvent //this.id = id;
        (//public long id;
        var position: Int
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        // 뷰를 새로 만들 때
        val convertView : View = LayoutInflater.from(parent.context).inflate(R.layout.item_call, parent, false)

        return ViewHolder(convertView)
    }

    override fun getItemCount(): Int {
        return callList!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val calls : CallItem? = callList?.get(position)

        holder.nameTextView?.text = calls?.getName()
        holder.phoneNumTextView?.text = calls?.getPhoneNum()

        holder.itemView.setOnClickListener { // MainActivity에 onItemClick이 받음
            EventBus.getDefault().post(ItemClickEvent(position))
            Log.d("TAG", "onBindViewHolder position 값 : $position")
        }

    }


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var nameTextView : TextView? = null
        var phoneNumTextView : TextView? = null

        init {
            val nameTextView = itemView.findViewById<TextView>(R.id.name_txt)
            val phoneNumTextView = itemView.findViewById<TextView>(R.id.phone_num_txt)

            this.nameTextView = nameTextView
            this.phoneNumTextView = phoneNumTextView
        }
    }
}