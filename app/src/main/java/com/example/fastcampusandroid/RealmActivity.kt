package com.example.fastcampusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fastcampusandroid.Realm.School
import io.realm.Realm
import io.realm.RealmConfiguration
import kotlinx.android.synthetic.main.activity_realm.*

class RealmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_realm)


        Realm.init(this)
        val config : RealmConfiguration = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            .allowWritesOnUiThread(true)
            .build()
        Realm.setDefaultConfiguration(config)

        val realm = Realm.getDefaultInstance()

        // 저장
        saveBtn.setOnClickListener{
            realm.executeTransaction{
                // A테이블에서 데이터를 가져온다 -> 10
                // B테이블에서 데이터를 가져온다
                // C테이블에서 데이터를 가져온다
                // 조합을 한다.
                // D테이블에 저장을 한다.
                with(it.createObject(School::class.java)){
                    this.name = "어떤 대학교"
                    this.location = "서울"
                }
            }
        }

        // 불러오기
        loadBtn.setOnClickListener{
            realm.executeTransaction{
                val data = it.where(School::class.java).findFirst()
                Log.d("TAG","data : $data")

            }
        }

        // 삭제
        delBtn.setOnClickListener{
            realm.executeTransaction{
                it.where(School::class.java).findAll().deleteAllFromRealm()
            }
        }
    }
}