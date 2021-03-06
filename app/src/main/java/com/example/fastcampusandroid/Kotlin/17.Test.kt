package com.example.fastcampusandroid.Kotlin


fun main(array : Array<String>){

    first()
    testResult(99)
    println(scoreAdd(88))
    //guguDan()
    guguDan2(5)

}


/*
   * 1번 문제
   * List를 2개 만든다.
   * 첫번쨰 ArrayList에는 0부터 9까지 값을 넣는다. (반복문 사용)
   * 두번째 ArrayList에는 첫번째 ArrayList의 값을 하나씩 확인한 후
   * 짝수면 True  홀수면 False를 넣어 준다.
   * */

fun first(){
    /*val ary1 = mutableListOf<Int>()
    val ary2 = mutableListOf<Boolean>()
    for(i in 0 until 10){
        ary1.add(i, i)
        if(ary1[i] % 2 == 0){
            ary2.add(i, true)
        }else{
            ary2.add(i, false)
        }
    }
    println(ary1)
    println(ary2)*/
    val list1 = MutableList(9, {0})
    val list2 = MutableList(9) { true }
    for (i in 0 until 9){
        list1[i] = i + 1
    }
    println(list1)

    list1.forEachIndexed{ index, value ->
        if(value % 2 == 0){
            list2[index] = true
        }else{
            list2[index] = false
        }
    }
    println(list2)



}


/*
    * 2번 문제
    * 학점을 구하자
    * 80 ~ 90 -> A
    * 70 ~ 79 -> B
    * 60 ~ 69 -> C
    * 나머지는 F
    * */
var result : String = ""
fun testResult(score : Int) : String{

    /*result = if(score in 90..100){
        "S"
    }else if(score in 80..89){
        "A"
    }else if(score in 70..79){
        "B"
    }else if(score in 60..70){
        "C"
    }else{
        "F"
    }*/

    when (score){
        in 90..100 ->{
            result = "S"
        }
        in 80 until 90 ->{
            result = "A"
        }
        in 70 until 80 ->{
            result = "B"
        }
        in 60 until 70 ->{
            result = "C"
        }
        else ->{
            result = "F"
        }
    }
    return result
}


/*
* 3번 문제
* 전달 받은 숫자의 각 자리 숫자의 합을 구하자
* 조건 : 전달 받은 숫자는 무조건 두자리 숫자이다.
* */

fun scoreAdd(number : Int) : Int{
    // number = 89  -> 8 + 9
    val a : Int = number / 10
    val b : Int = number % 10

    return a + b
}



/*
   * 4번 문제
   * 구구단을 출력하자.
   * */

fun guguDan(){
    for(i in 1 until 10){
        for(j in 1 until 10){
            println("$i * $j = " + i * j)
        }
    }
}

fun guguDan2(dan : Int){
    for (j in 1 until 10){
        println("$dan 단 -> $dan * $j = " + dan * j)
    }
}