package com.example.fastcampusandroid.Kotlin

// 02. 자료형
// 정수형 -> Long > Int > Short > Byte
// 실수형 -> Double Float
// 문자 -> Char
// 문자열 -> String
// 논리형(참True / 거짓 False) -> Boolean

// 변수 선언하는 방법 (1)
// Variable / Value 변수명 = 값
// var / val 변수명 = 값
var number = 10

// 변수 선언하는 방법 (2)
// var / val 변수 : 자료형 = 값
var number1 : Int = 20
var hello1 : String = "Hello"
var point1 : Double = 3.4

val fix = 20

// Variable or Value ??
// - 1. 값이 변하지 않는다면 Value == val (상수)
// - 2. 값이 변한다면 Variable == var(변수)
// - 3. 값이 변할지 모르겠다면 Value == val (상수)

fun main(array: Array<String>){

    println(number)

    number = 20

    println(number)

    println(number1)
    println(hello1)
    println(point1)
    println(fix)


}