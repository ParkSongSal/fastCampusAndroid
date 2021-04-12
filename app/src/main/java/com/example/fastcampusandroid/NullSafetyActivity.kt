package com.example.fastcampusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NullSafetyActivity : AppCompatActivity() {

    lateinit var lateCar : Car

    class Car(var number : Int){
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)


        val number : Int = 10
        val number1 : Int? = null

        // !! -> 개발자가 null이 아님을 보장하기 떄문에 사용을 권하지 않는다.
        val number5 : Int = number1!! + 10
//
//        //val number3 = number? + number1
//        val number3 = number1?.plus(number)
//        Log.d("TAG", "number3 : $number3")
//
//        // 삼항연산자 -> 엘비스 연산자(?:)
//        // Null Safety
//        val number4 = number1 ?: 10
//        Log.d("TAG", "number4 : $number4")

        // 정상
        // lateCar = Car(10)
        Log.d("TAG", " lateNumber $lateCar.number")

        // lateCar = Car(10) -> 오류 lateinit을 선언했으면 사용하기전에 반드시 초기화를 해줘야한다.
    }

    fun plus(a : Int, b:Int?) : Int{
        if(b != null) return a + b
        else return a
    }

    fun plus2(a:Int, b:Int?) : Int?{
        return b?.plus(a)
    }
}