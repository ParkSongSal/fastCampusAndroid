package com.example.fastcampusandroid.Kotlin

/*
* 과제
* Night, Monster (부모) -> Charactor
* SuperNight, SuperMonster (자식)
* */

fun main(array : Array<String>){

    val monster = SuperMonster24(100, 10)
    val night = SuperNight24(130, 8)

    monster.attack(night)
    monster.bite(night)
}

open class Charator(var hp : Int, val power : Int){
    fun attack(charator: Charator, power : Int = this.power){

        charator.defense(power)
    }

    open fun defense(demage: Int){
        hp -= demage
        if(hp > 0){
            println("${javaClass.simpleName}의 남은 체력은 $hp 입니다.")
        }else{
            println("사망했습니다.")
        }
    }
}

class SuperMonster24(hp : Int, power : Int) : Charator(hp, power){
    fun bite(charator: Charator){
        super.attack(charator, power + 5)
    }
}

class SuperNight24(hp: Int, power : Int) : Charator(hp, power){

    val defensePower = 3

    override fun defense(demage: Int) {
        super.defense(demage - defensePower)
    }
}
