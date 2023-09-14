package com.example.hellokotlin._5_collectionsArray

import kotlin.random.Random

fun main() {


    val sayilar = ArrayList<Int>()

    //100 tane rastgele sayi üretme

    for (i in 1..100) {
        val rastgeleSayi = Random.nextInt(0,101)
        sayilar.add(rastgeleSayi)
    }
    sayilar.sort()

    for (s in sayilar) {
        println(s)
    }

}