package com.example.fastcampusandroid.common

import android.content.Context
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

open class Common {


    open fun customToast(context: Context, txt: String){
        Toast.makeText(context, txt, Toast.LENGTH_SHORT).show()
    }


    open fun nowDate() : String{
        val currentTime = Calendar.getInstance().time

        var getDate = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(currentTime)
        return getDate
    }
}