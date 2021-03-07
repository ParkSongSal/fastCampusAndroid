package com.example.fastcampusandroid.Kotlin

import kotlin.random.Random


fun main(array : Array<String>){

    val math : Math = Math()
    println("더하기 : " + math.plusFun(5,10))
    println("뺴기 : " + math.minusFun(15,10))
    println("곱하기 : " + math.mulFun(15,10))
    println("나누기 : " + math.divFun(100,10))

}

/*
* 1) 사칙 연산을 수행할 수 있는 클래스
* */
class Math(){

    fun plusFun(num1 : Int, num2 : Int) : Int{
        return num1 + num2
    }

    fun minusFun(num1 : Int, num2 : Int) : Int{
        return num1 - num2
    }

    fun mulFun(num1 : Int, num2 : Int) : Int{
        return num1 * num2
    }

    fun divFun(num1 : Int, num2 : Int) : Int{
        return num1 / num2
    }
}

/*
* 2) 은행 계좌 만들기
* - 계좌 생성 기능 (이름, 생년 월일)
* - 잔고를 확인하는 기능
* - 출금 기능
* - 예금 기능
* */
class Bank{

    val name : String
    val birth : String
    var balance : Int

    constructor(name : String, birth: String, balance : Int){
        this.name = name
        this.birth = birth

        if(balance >= 0){
            this.balance = balance
        }else{
            this.balance = 0
        }
    }

    fun checkBalance() : Int{
        return balance
    }

    fun withDraw(amount: Int) : Boolean{
        if (balance >= amount){
            balance -= amount
            return true
        }else{
            return false
        }
    }

    fun save(amount : Int){
        balance += amount
    }
}
/*
* 3) TV 클래스
* - on/off 기능
* - 채널을 돌리는 기능
* - 초기 채널은 (S사 M사 K사 3개)
* */

class TV(){

}

