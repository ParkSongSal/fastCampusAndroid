package com.example.fastcampusandroid.Kotlin

var a = 1 + 2 + 3 + 4 + 5 //연산의 결과값을 변수에 넣어 줄 수 있다.
var b = "1"
var c = b.toInt()   // 문자형인 b를 toInt로 Int형으로 변환해서 c에 넣어준다.
var d = b.toFloat() // 문자형인 b를 toFloat으로 Float형으로 변환해서 d에 넣어준다.

var e = "John"
var f = "My name is $e Nice to meet you"

/*
* Null
* - 값이 존재 하지 않는다.
* - 자료형? -> null을 가질 수 있는 자료형이 됨
* */
//var abc : Int = null
var abc1 : Int? = null
var abc2 : Double? = null

var g = a + 3

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1)
    println(abc2)
    println(g)
}
