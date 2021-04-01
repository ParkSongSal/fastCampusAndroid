package com.example.fastcampusandroid.Room

import android.content.Context
import android.util.Log
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [Users::class], version = 1, exportSchema = false)
abstract class UserDataBase : RoomDatabase() {
    abstract fun userDao(): UserDAO

    companion object {
        private var instance: UserDataBase? = null
        @Synchronized
        fun getInstance(context: Context): UserDataBase? {
            if (instance == null) {
                instance = Room.databaseBuilder(context.applicationContext, UserDataBase::class.java,"UsersTable.db")
                            .allowMainThreadQueries()
                            .build()
            }
            return instance
        }

        val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("CREATE TABLE User (mNickName Text, mPhoneNum Text NOT NULL, PRIMARY KEY(mPhoneNum))")

                database.execSQL("DROP TABLE User")

                database.execSQL("ALTER TABLE User RENAME TO User")
            }
        }
    }

    open fun destroyinstance(){
        instance = null
    }


}