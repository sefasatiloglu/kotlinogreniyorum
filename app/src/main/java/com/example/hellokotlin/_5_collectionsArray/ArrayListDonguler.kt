package com.example.hellokotlin._5_collectionsArray

fun main() {

    val meyveler = ArrayList<String>()

    meyveler.add("Cilek")
    meyveler.add("Kiraz")
    meyveler.add("Karpuz")
    meyveler.add("Kavun")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Armut")

    for (meyve in meyveler) {
        println(meyve)
    }

    for ((indeks,meyve) in meyveler.withIndex()) {

        println("${indeks+1}.$meyve")

    }



}