package com.example.fastcampusandroid.Kotlin

/*
* 20. 전역, 지역 변수
* */

var number100 : Int = 10

fun main(array : Array<String>){
    println(number100)
    val test = Test("김종기")
    test.testFun()
    println(number100)
    println(test.name)

}



class Test(var name : String){
    fun testFun(){
        var birth : String = "2000-03-01"
        name = "박상묵"
        number100 = 100
    }

    fun testFun2(){

    }
}