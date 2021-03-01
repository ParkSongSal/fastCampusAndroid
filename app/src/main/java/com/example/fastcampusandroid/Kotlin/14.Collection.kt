package com.example.fastcampusandroid.Kotlin

/*
* 14. Collection
* -> list, set, map
* */

fun main(array : Array<String>){

    // List -> 중복을 허용한다.
    val numList = listOf<Int>(1, 2, 3, 3)
    println(numList)
    val num1 = numList[0]
    println(num1)

    // Set
    // - 중복된 값은 알아서 제거 한다.
    // - 순서가 없기 때문에 Index가 없다.
    val numSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numSet)
    numSet.forEach{
        println(it)
    }

    // Map -> Key, Value 방식으로 관리한다.
    val numMap = mapOf<String, Int>("one" to 1, "two" to 2, "age" to 28)
    val num3 = numMap["one"]
    val age = numMap["age"]
    println(num3)
    println(age)

    // Mutable Collection (변경가능)
    val numMutableList = mutableListOf<Int>(1, 2, 3)
    numMutableList.add(3, 4)
    println()
    println(numMutableList)

    val numMutableSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    numMutableSet.add(1)
    println(numMutableSet)

    val numMutableMap = mutableMapOf<String, Int>("one" to 1)
    numMutableMap["two"] = 2
    println(numMutableMap)
}