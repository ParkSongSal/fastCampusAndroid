package com.example.fastcampusandroid.models

import java.io.Serializable

class ListItem : Serializable{

    private var title : String = ""
    private var date : String = ""
    private var cls : Class<*>


    constructor(title: String, date: String, cls: Class<*>) {
        this.title = title
        this.date = date
        this.cls = cls
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String?) {
        this.title = title!!
    }

    fun getDate(): String? {
        return date
    }

    fun setTitle2(date: String) {
        this.date = date
    }

    fun getCls(): Class<*>? {
        return cls
    }

    fun setCls(cls: Class<*>?) {
        if (cls != null) {
            this.cls = cls
        }
    }


}