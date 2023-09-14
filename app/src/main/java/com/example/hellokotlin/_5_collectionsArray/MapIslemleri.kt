package com.example.hellokotlin._5_collectionsArray

fun main() {

    //Map

    val sayilar = mapOf<Int,String>(1 to "bir", 2 to "iki")

    val oranlar = mutableMapOf(1.5 to "Oran1", 3.4 to "Oran2")

    val iller = HashMap<Int,String>()

    // değer ekleme
    iller.put(27,"Gaziantep")
    iller.put(16,"Bursa")
    iller.put(34,"İstanbul")

    println(iller.toString())
    // Eğer bu kayıttan varsa bu şekilde veriyi güncelleyebilirsin.
    iller.put(16,"Yeni BURSA")

    println(iller.toString())
    // getirme işlemi
    println(iller.get(34))
    println(iller.size)
    println(iller.isEmpty())
    println(iller.containsKey(27))
    println(iller.containsValue("Gaziantep"))
    for ((anahtar,deger) in iller) {
        println("$anahtar,$deger")
    }
    //silme işlemi
    iller.remove(16)
    println(iller.toString())
    //tüm map'i silme
    iller.clear()
    println(iller.toString())


}