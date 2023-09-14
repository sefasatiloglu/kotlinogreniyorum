package com.example.hellokotlin._5_collectionsArray

fun main() {

    val o1 = Ogrenciler(1,"sefa","12F")
    val o2 = Ogrenciler(2,"cevdet","11A")
    val o3 = Ogrenciler(3,"ipek","9C")
    val o4 = Ogrenciler(1,"Ece","12A")

    val ogrenciler = HashSet<Ogrenciler>()
    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    for (o in ogrenciler) {
        println("***********************")
        println("Ögrenci No: ${o.no}")
        println("Öğrenci Adi: ${o.ad}")
        println("Öğrenci Sınıf: ${o.sinif}")
    }

}