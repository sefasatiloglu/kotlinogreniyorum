package com.example.hellokotlin._5_collectionsArray

fun main() {

    val meyveler = ArrayList<String>()

    meyveler.add("Çilek")//0 index
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")
    println(meyveler.toString())

    println(meyveler.isEmpty()) // false (Meyveler arraylisti boş mu ?)
    println(meyveler.count()) // Array listin boyutu
    println(meyveler.size) // ikisi de aynı işlemi yapar.
    println(meyveler.first())// ilk elemanı yazdırır
    println(meyveler.last()) // son elemanı yazdırır.
    println(meyveler.contains("Kiraz")) // bu eleman var mı yok mu diye kontrol eder.
    println(meyveler.max()) // Harf sırasına görre sıralar maximum da z
    println(meyveler.min()) // Harf sırasına göre sıralar minumum da a
    meyveler.sort() // Harf sırasına göre sıralama yapar.
    println(meyveler.toString()) // Tüm elemanları yazdırma
    meyveler.reverse() // Tüm elemanlari tersten yazdirir.
    println(meyveler.toString())
    meyveler.removeAt(3) // 3.indexde ki elemanı sil
    println(meyveler.toString())
    meyveler.remove("Kivi") // Listenin içinde ki Kivi yi bulup siliyor.
    println(meyveler.toString())
    meyveler.clear() // tüm listeyi siler
    println(meyveler.toString())





}