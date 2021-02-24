package com.example.fastcampusandroid.Kotlin

/*
* 10. 제어흐름(2)
* - When
* - 많이 사용함
* */

fun main(array : Array<String>){

    val value : Int = 3


    /*코드가 1줄일땐 중괄호{} 생략가능*/
    when(value){
        1 -> println("value is 1")
        2 -> println("value is 2")
        3 -> println("value is 3")
        else -> println("I do not know Value!!")
    }

    when(value){
        1 ->{
            println("value is 1")
        }
        2 ->{
            println("value is 2")
        }
        3 ->{
            println("value is 3")
        }
        else ->{
            println("I do not know Value!!")
        }
    }

    if (value ==1) println("value is 1#")
    else if(value == 2) println("value is 2#")
    else if(value == 3) println("value is 3#")
    else println("I do not know Value####")

    val value2 = when(value){
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)
}