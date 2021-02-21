package com.example.fastcampusandroid.Kotlin

/*
* 04. Function
* - 함수란? 어떤 input을 넣어주면 어떤 output이 나오는 것
*  ex) y = x + 2
*
* - 함수를 선언하는 방법
* fun 함수명 (변수명 : 타입, 변수명 : 타입 ....) : 반환형{
*   함수 내용
*   return 반환값
* }
*
* */

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// - Default 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

/*
- 반환값이 없는 함수 만들기 (2)
- Java : Void / Kotlin : Unit
- Unit 생략가능
*/
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

// 반환값이 없는 함수 만들기 (2)
fun printPlus2(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

// - 간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second

// - 가변인자를 갖는 함수 선언하는 방법
// - 1개부터 n개까지 인자를 받을 수 있음
fun plusMany(vararg numbers: Int) {
    var result : Int = 0

    for (number in numbers){
        result += number
    }

    println(result)
}
fun main(array: Array<String>) {
    // 함수를 호출 하는 방법
    val result = plus(5, 155)

    // 인수를 명시적으로 전달하는 방법
    val result2 = plus(first = 20, second = 30)

    val result3 = plus(second = 30, first = 50)
    println(result)
    println(result2)
    println(result3)

    // 디폴트 값을 갖는 함수 호출하기
    println("=====================================")

    val result4 = plusFive(10, 20)
    println(result4)

    val result5 = plusFive(15)
    println(result5)


    println("=====================================")
    printPlus(150, 99)

    println("=====================================")

    val result6 = plusShort(200, 300)
    println(result6)

    println("=====================================")
    plusMany(5, 15, 99, 15)
}

