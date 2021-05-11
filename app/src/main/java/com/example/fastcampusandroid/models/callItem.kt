package com.example.fastcampusandroid.models

import java.io.Serializable

class CallItem : Serializable{

    private var name : String = ""
    private var phoneNum : String = ""

    constructor(name: String, phoneNum: String) {
        this.name = name
        this.phoneNum = phoneNum
    }


    fun getName() : String? {
        return name
    }

    fun setName(name : String){
        this.name = name
    }

    fun getPhoneNum() : String?{
        return phoneNum
    }

    fun setPhoneNum(phoneNum : String){
        this.phoneNum = phoneNum
    }


}