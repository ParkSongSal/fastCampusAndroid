package com.example.fastcampusandroid.Kotlin

/*
* 23. 상속
* -> 부모로부터 설명서를 물려받는다!
* 같은 코드가 두번까지는 봐준다
* 두번 이상이 넘어가면 리팩토링을 해라
* */
var number23 = 10
fun main(array : Array<String>){
    val superCar23 = SuperCar23()
    println(superCar23.drive())
    superCar23.stop()

    val bus23 = Bus23()
    //bus23.stop()  // 상속을 받지 않았으므로 stop메소드를 사용 못한다.

}

// 부모 : Car23
// 자식 : SuperCar23, Bus23
open class Car23(){
    open fun drive() : String{
        return "Driving!!!"
    }
    fun stop(){

    }
}

class SuperCar23() : Car23(){
    override fun drive() : String {
        val run = super.drive()
        return "fast $run"
    }
}

class Bus23(){

}