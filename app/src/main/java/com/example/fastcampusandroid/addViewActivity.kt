package com.example.fastcampusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_add_view.*
import kotlinx.android.synthetic.main.item_addview.view.*

class addViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_view)

        // 아이템 리스트 준비
        val carList = ArrayList<Car>()

        for(i in 0 until 10){
            carList.add(Car("" + i + "번째 자동차", "" + i + "순위 엔진"))
        }

        val container = addViewContainer
        val inflater = LayoutInflater.from(this@addViewActivity)
        for(i in 0 until carList.size){
            val itemView = inflater.inflate(R.layout.item_addview, null)
            val carNameView = itemView.carName
            val carEngineView = itemView.carEngine

            carNameView.text = carList[i].name
            carEngineView.text = carList[i].engine
            container.addView(itemView)
        }

    }


}

class Car(val name : String, val engine : String){

}