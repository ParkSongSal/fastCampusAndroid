package com.example.fastcampusandroid.Kotlin

/*
* 18. Class
*
* 1) OOP -> Object Oriented Programming (객체지향 프로그래밍)
*
* 객체란 뭘까??
* -> 이름이 있는 모든 것
*
* 절차지향 프로그래밍 문제 해결 방법
* -> 코드를 위에서 부터 아래로 실행을 하면 문제가 해결된다!
*
* 객체지향 프로그래밍 문제 해결 방법
* -> 객체를 만들어서, 객체에게 일을 시켜 문제를 해결한다.
*
* ex) 선수, 심판, 경기장, 관중 (객체) -> 축구 게임
*
* 객체를 만드는 방법
* -> 설명서(Class)가 있어야 합니다.
* */

fun main(array : Array<String>){

    // Class(설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "Big")
    val bigCar = Car("v8 engine", "Big")

    val superCar : SuperCar = SuperCar("good engine", "big", "white")

    // 인스턴스가 가지고 있는 기능을 사용하는 방법
    val driveCar : DriveCar = DriveCar("simple engine", "short body")
    driveCar.ride()
    driveCar.navi("서울")
    driveCar.drive()

    val driveCar2 : DriveCar2 = DriveCar2("nice engine", "long body")
    println(driveCar2.engine)
    println(driveCar2.body)
    driveCar2.drive()

    println()
    val testClass : TestClass = TestClass()
    testClass.test(5)
    testClass.test(10,15)
}

// 클래스(설명서) 만드는 방법 (1)
class Car(var engine : String, var body : String){

}

// 클래스(설명서) 만드는 방법 (2)
class SuperCar {
    var engine : String
    var body : String
    var door : String

    constructor(engine: String, body: String, door : String){
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법 (3) -> 1번 방법의 확장
class Car1 constructor(engine: String, body: String){

    var door : String = ""

    // 생성자
    constructor(engine: String, body: String, door: String) : this(engine, body){
        this.door = door
    }

}

// 클래스(설명서) 만드는 방법 (4) -> 2번 방법의 확장
class Car2{
    var engine : String = ""
    var body : String = ""
    var door : String = ""

    constructor(engine: String, body: String){
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String){
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class DriveCar(engine : String, body: String){

    fun ride(){
        println("탑승 하였습니다.")
    }

    fun drive(){
        println("주행 중 입니다.")
    }

    fun navi(destination : String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

class DriveCar2{
    var engine : String
    var body : String

    constructor(engine: String, body: String){
        this.engine = engine
        this.body = body
    }

    init {
        // 초기셋팅을 할때 유용하다.
        println("DriveCar2가 만들어 졌습니다.")
    }

    fun ride(){
        println("탑승 하였습니다.")
    }

    fun drive(){
        println("주행 중 입니다.")
    }

    fun navi(destination : String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

// 오버로딩
// -> 이름이 같지만 받는 파라미터가 다른함수
class TestClass(){
    val a : Int = 10
    val b : Int = 11

    fun test(a : Int){
        println("up")
    }

    fun test(a: Int, b: Int){
        println("down")
    }
}