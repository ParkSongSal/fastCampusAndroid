package com.example.fastcampusandroid.Kotlin

/*
* 12. 배열
* 배열이 필요한 이유
* - 그룹이 필요할 때
* */

fun main(array : Array<String>){

    // 배열을 생성하는 방법(1) - 선언한 타입만 넣어야한다.
    var num1 : Int = 10
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)

    println(group1 is Array)

    println(group1[0])

    // 배열을 생성하는 방법(2) - arrayOf는 타입을 선언안하면 타입을 섞어 넣어도 상관없다.
    var num2 = 20
    var group2 = arrayOf(1, 2, 3.5, "Hello")

    println(group2 is Array)
    println(group2)

    /*
    * Index 란
    * -> 순서(번째)
    * [1, 2, 3, 4, 5]
    * '0' 부터 시작
    * index 0 -> 1, index3 -> 4
    * */

    // 배열의 값을 꺼내는 방법(1)
    val test1 = group2[0]
    val test2 = group2[3]

    println(test1)
    println(test2)

    // 배열의 값을 꺼내는 방법(2)
    val test3 = group2.get(3)
    println(test3)

    // 배열의 값을 바꾸는 방법 (1)
    group1.set(0, 100)
    println(group1[0])

    // 배열의 값을 바꾸는 방법 (2)
    group1[1] = 200
    println(group1[1])

}