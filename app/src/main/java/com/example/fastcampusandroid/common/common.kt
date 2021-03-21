package com.example.fastcampusandroid.common

import android.content.Context
import android.widget.Toast

open class Common {


    open fun customToast(context : Context, txt : String ){
        Toast.makeText(context, txt,Toast.LENGTH_SHORT).show()
    }

}