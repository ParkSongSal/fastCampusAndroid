package com.example.fastcampusandroid.Kotlin

/*
* 08. 제어 흐름
*
* - if, else
* */



fun main(array : Array<String>){
    val a : Int= 5
    val b : Int = 10

    // if/else 사용하는 방법 (1)
    if(a > b){
        println("a가 b보다 크다!!!!!!!!!!!$a")
    }else{
        println("b가 a보다 크다!!!!!!!!!!!$b")
    }

    // if/else 사용하는 방법(2)
    if(a > b){
        println("a가 b보다 큽니다####")
    }

    // if/else if / else 사용하는 방법
    if(a > b){
        println("a가 b보다 큽니다$$$")
    }else if(a < b){
        println("b가 a보다 큽니다$$$")
    }else{
        println("a와 b는 같다$$$")
    }

    // 값을 리턴하는 if 사용방법
    val max = if(a > b) a else b

    println()
    println(max)

}
