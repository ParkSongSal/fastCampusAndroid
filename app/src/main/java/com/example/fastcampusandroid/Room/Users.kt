package com.example.fastcampusandroid.Room

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "tb_users")
data class Users(@PrimaryKey(autoGenerate = true) val id:Int,
                 var NickName : String,
                 var PhoneNum : String)


