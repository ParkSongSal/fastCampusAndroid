package com.example.fastcampusandroid.Kotlin

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(array : Array<String>){

    val a = mutableListOf<Int>(1, 2, 3)
    a.add(3, 4)
    a.add(4, 5)
    a.add(0, 100)
    println(a)
    a[0] =  200
    println(a)
    a.removeAt(0)
    println(a)

    println()
    val b = mutableSetOf<Int>(1, 2, 3, 4, 4, 3)
    b.add(2)
    println(b)
    b.remove(2)
    println(b)
    b.remove(100)
    println(b)

    val c = mutableMapOf<String, Int>("one" to 1)
    println()
    c["two"] = 2
    println(c)
    c.replace("two", 20)
    println(c)
    println(c.keys)
    println(c.values)
    c.clear()
    println(c)





}