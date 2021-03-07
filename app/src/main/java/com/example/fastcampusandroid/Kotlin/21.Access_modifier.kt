package com.example.fastcampusandroid.Kotlin

/*
* 21. 접근 제어자
* */

fun main(array: Array<String>){

    val testAccess = TestAccess("아무기")
    // private 접근자 때문에 외부에서 더이상 접근할수 없다.
    //testAccess.test()
    testAccess.changeName("김동이")


    val reward = Reward()
    reward.rewardAmount = 2000

    val runningCar  = RunningCar()
    runningCar.runFast()
    //runningCar.run()
}

class Reward(){
    var rewardAmount : Int = 1000
}
class TestAccess{
    private var name : String = "홍길동"

    constructor(name : String){
        this.name = name
    }

    fun changeName(newName : String){
        this.name = newName
        println(name)
    }
    private fun test(){
        println("테스트!!")
    }
}

class RunningCar(){

    fun runFast(){
         run()
    }

    private fun run(){

    }
}