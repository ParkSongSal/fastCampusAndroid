package com.example.fastcampusandroid.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fastcampusandroid.R
import com.example.fastcampusandroid.Room.Users
import com.example.fastcampusandroid.Room.Users2

class UsersAdapter() : RecyclerView.Adapter<UsersAdapter.ViewHolder>() {




    var userList: List<Users>? = null
    var mContext: Context? = null

    constructor(context: Context, userList: List<Users>?) : this() {
        this.userList = userList
        mContext = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersAdapter.ViewHolder {
        //뷰를 새로 만들 때
        val convertView: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_room, parent, false)

        return ViewHolder(convertView)
    }

    override fun onBindViewHolder(holder: UsersAdapter.ViewHolder, position: Int) {

        // 데이터

        // 데이터
        val user: Users = userList!![position]

        holder.mNickName.text = user.NickName
        holder.mPhone.text = user.PhoneNum

    }

    override fun getItemCount(): Int {
        return userList!!.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var linear_1: LinearLayout
         var mNickName: TextView
         var mPhone : TextView

        //ImageButton delBtn;
        init {
            // 레이아웃 들고 오기
            val linear_1 = itemView.findViewById<LinearLayout>(R.id.linear_1)
            val mNickName = itemView.findViewById<TextView>(R.id.nickNameTxt)
            val mPhone = itemView.findViewById<TextView>(R.id.phoneTxt)

            this.linear_1 = linear_1
            this.mNickName = mNickName
            this.mPhone = mPhone
        }
    }
}