package com.example.hellokotlin._5_collectionsArray

fun main() {

    val o1 = Ogrenciler(1,"sefa","12F")
    val o2 = Ogrenciler(2,"cevdet","11A")
    val o3 = Ogrenciler(3,"ipek","9C")


    val ogrenciler = HashMap<Int,Ogrenciler>()
    ogrenciler.put(o1.no,o1)
    ogrenciler.put(o2.no,o2)
    ogrenciler.put(o3.no,o3)

    for ((k,v ) in ogrenciler ) {
        println("****************")
        println("Ögrenci No: $k")
        println("Öğrenci Ad: ${v.ad}")
        println("Öğrenci Sınıf : ${v.sinif}")

    }


}