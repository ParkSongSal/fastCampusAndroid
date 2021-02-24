package com.example.fastcampusandroid.Kotlin

/*
* 11. 제어흐름(2) 실습
* */

fun main(array : Array<String>){

    val value : Int? = null
    when (value){
        null -> println("value is null")
        else -> println("value is not null")
    }


    val value2 : Boolean? = null
    // when 구문은 조건으로 갖는 값의 모든 경우에 대응 해주는것이 좋다!!
    when (value2){
        true -> println("value2 is true!!")
        false -> println("value2 is false!!")
        null -> println("value2 is null!!")
    }

    // 값을 리턴하는 when 구문의 경우 반드시 값을 리턴해야 한다.
    val value3 = when(value2){
        true -> 1
        false -> 3
        //null -> null
        else -> null
    }

    println(value3)
    println()

    // when 의 다영한 조건식 (1)
    val value4 : Int = 10
    // 변수의 타입을 물을 떄 is
    when (value4){
        is Int -> println("value4 is Int!!")
        else -> println("value4 is not Int!!")
    }

    // when 의 다양한 조건식 (2)
    val value5 : Int = 87
    when (value5){
        in 60..70 -> println("value5는 60 ~ 70 사이의 값입니다.")
        in 70..80 -> println("value5는 70 ~ 80 사이의 값입니다.")
        in 80..90 -> println("value5는 80 ~ 90 사이의 값입니다.")
    }


}