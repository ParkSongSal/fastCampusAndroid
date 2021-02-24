package com.example.fastcampusandroid.Kotlin

fun main(array : Array<String>){

    val a : Int? = null
    val b : Int = 10
    val c : Int = 100

    if (a == null){
        println("a Is Null!! $a")
    }else{
        println("a Is Not Null!! $a")
    }

    if ( b + c == 110){
        println("b + c = 110")
    }else{
        println("b + c != 110")
    }

    // 엘비스 연산자 ?:
    val number : Int? = null
    val number2 = number ?: 10
    println()
    println(number2)

    val num1 : Int = 10
    val num2 : Int = 20

    val max = if (num1 > num2){
        num1
    }else if(num1 == num2){
        num2
    }else{
        num1
    }
    

    println()
    println(max)
}