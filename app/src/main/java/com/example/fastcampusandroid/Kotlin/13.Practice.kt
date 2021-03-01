package com.example.fastcampusandroid.Kotlin

fun main(array : Array<String>){

    val ary1 = arrayOf<Int>(1, 2, 3)

    //get, set
    val num1 = ary1[0]
    println(num1)
    // val num2 = ary1[100] // 인덱스에 주의 해야 한다.

    ary1[0] = 100
    val num2 = ary1[0]
    println(num2)

    //ary1[100] = 100
    // Array의 Bounds
    // - 처음 만들때 결정된다.

    // Array를 만드는 방법 (3)
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('a', 'b', 'c')
    val a3 = doubleArrayOf(1.1, 2.5, 3.9)
    val a4 = booleanArrayOf(true, false, true)

    // Array를 만드는 방법 (4) -> lambda 를 활용한 방법
    var a5 = Array(10, {0})
    var a6 = Array(5, {1;2;3;4;5;})

}