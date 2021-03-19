package com.example.fastcampusandroid.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.fastcampusandroid.R
import com.example.fastcampusandroid.models.ListItem

class MyAdapter(listitem: MutableList<ListItem>) : BaseAdapter() {
    private val mData: List<ListItem>
    override fun getCount(): Int {
        return mData.size
    }

    override fun getItem(position: Int): Any {
        return mData[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var convertView = convertView
        val viewHolder: ViewHolder?
        //convertView : 재사용 되는뷰
        if (convertView == null) {
            viewHolder = ViewHolder()

            //뷰를 새로 만들 때
            convertView = LayoutInflater.from(parent.context)
                .inflate(R.layout.list, parent, false)

            // 레이아웃 들고 오기
            val titleTextView = convertView.findViewById<View>(R.id.title_txt) as TextView
            val dateTextView = convertView.findViewById<View>(R.id.date_txt) as TextView
            viewHolder.titleTextView = titleTextView
            viewHolder.dateTextView = dateTextView
            convertView.tag = viewHolder
        } else {
            // 재사용 할 때
            viewHolder = convertView.tag as ViewHolder
        }

        // 데이터
        val listitem: ListItem = mData[position]


        // 화면에 뿌리기
        viewHolder.titleTextView?.text = listitem.getTitle()
        viewHolder.dateTextView?.text = listitem.getDate()
        return convertView
    }

    private class ViewHolder {
        var titleTextView: TextView? = null
        var dateTextView: TextView? = null
    }

    init {
        mData = listitem
    }
}