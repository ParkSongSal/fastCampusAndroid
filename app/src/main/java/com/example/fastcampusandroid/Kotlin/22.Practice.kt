package com.example.fastcampusandroid.Kotlin

fun main(array : Array<String>){

    val night = Night(20, 4)
    val monster = Monster(15,3)

    night.attack(monster)
    monster.attack(night)

    /*night.hp = 100
    println(night.hp)

    monster.hp = 200
    monster.power = 100
    night.heal()
    */

}

class Night(private var hp : Int,private var power : Int){

    fun attack(monster : Monster){
        monster.defence(power)
    }

    fun defence(demage: Int){
        hp -= demage
        if(hp > 0) {
            heal()
            println("기사 현재 체력은 $hp 입니다")
        }
        else println("기사가 죽었습니다.")
    }

    private fun heal(){
        hp += 2
    }
}

class Monster(private var hp : Int, private var power : Int){

    fun attack(night: Night){
        night.defence(power)

    }

    fun defence(demage : Int){
        hp -= demage
        if(hp > 0) println("몬스터 현재 체력은 $hp 입니다")
        else println("몬스터가 죽었습니다.")
    }
}