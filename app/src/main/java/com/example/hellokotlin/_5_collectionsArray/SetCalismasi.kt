package com.example.hellokotlin._5_collectionsArray

fun main() {

    val meyveler = setOf<String>("Çilek","Muz","Elma","Kivi")

    val iller = mutableSetOf<String>("Bursa","Gaziantep","İstanbul","İzmir")

    val sayilar = HashSet<Int>()

    sayilar.add(10)
    sayilar.add(20)
    sayilar.add(30)
    println(sayilar.toString())

    sayilar.add(20) // daha önce 20 yi eklediğimiz için setlerin yapısı bu şekilde çalışıyor. Sadece 1 tane oluyor.
    println(sayilar.toString())
    sayilar.add(21)
    println(sayilar.toString())

    //index numarasını yazıp elemanı getirir.
    println(sayilar.elementAt(1))
    println(sayilar.size)
    println(sayilar.count())
    println(sayilar.isEmpty()) // sayilar boş mu ?
    println(sayilar.contains(20)) // 20 verisi sayilar set'in içinde var mı diye bakıyor.
    println(sayilar.contains(25)) // 25 olmadığı için false değer döndürüyor.

    for (s in sayilar) {
        println(s)
    }

    for ((i,s) in sayilar.withIndex()) {
        println("$i : $s")
    }
    sayilar.remove(10) // silmek istediğimiz veriyi yazıyoruz
    println(sayilar.toString())
    sayilar.clear() // tüm elemanları siler
    println(sayilar.toString())



}