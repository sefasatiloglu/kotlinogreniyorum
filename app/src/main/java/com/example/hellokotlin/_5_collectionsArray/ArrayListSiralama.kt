package com.example.hellokotlin._5_collectionsArray

fun main() {

    val k1 = Kisiler(1,"sefa")
    val k2 = Kisiler(2,"cevdet")
    val k3 = Kisiler(3,"ipek")

    val kisilerArrayList = ArrayList<Kisiler>()

    kisilerArrayList.add(k1)
    kisilerArrayList.add(k2)
    kisilerArrayList.add(k3)

    println("Önce")
    for (k in kisilerArrayList) {

        println("${k.kisiNo} - ${k.kisiAd}")
    }
    println("Sayisal Küçükten Büyüğe")

    val siralamaArrayList1 = kisilerArrayList.sortedWith(compareBy {it.kisiNo})

    for (k in siralamaArrayList1) {
        println("${k.kisiNo} - ${k.kisiAd}")

    }
    println("Sayisal büyükten küçüğe")

    val siralamaArrayList2 = kisilerArrayList.sortedWith(compareByDescending { it.kisiNo })
    for (k in siralamaArrayList2){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("Harfsel Büyükten Küçüğe")
    val siralamaArrayList3 = kisilerArrayList.sortedWith(compareByDescending { it.kisiAd })

    for (k in siralamaArrayList3) {
        println("${k.kisiNo} - ${k.kisiAd}")

    }

}