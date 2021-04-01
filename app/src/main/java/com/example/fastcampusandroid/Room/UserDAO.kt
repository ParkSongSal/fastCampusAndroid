package com.example.fastcampusandroid.Room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDAO {
    /*
    * id 순서로 정렬된 User 리스트를 반환하는 메서드
    * @return 모든 User 리스트
    * */
    @Query("SELECT * FROM tb_users ORDER BY id DESC")
    fun getAllPerson() : List<Users>?

    @Insert
    fun insertAll(vararg users: Users)

    @Query("SELECT COUNT(id) FROM `tb_users`")
    fun getCount(): Int
}