package com.example.hellokotlin._5_collectionsArray

fun main() {

    val o1 = Ogrenciler(1,"sefa","11F")
    val o2 = Ogrenciler(2,"ege","10V")
    val o3 = Ogrenciler(3,"remile","12A")
    val o4 = Ogrenciler(4,"ipek","9Z")
    val o5 = Ogrenciler(5,"sercan","11F")
    val o6 = Ogrenciler(6,"nedim","10C")

    val ogrenciler = ArrayList<Ogrenciler>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)
    ogrenciler.add(o6)
    //Filtreleme yapma



    for (o in ogrenciler) {
        println("***************************")
        println("Öğrenci No: ${o.no} ")
        println("Öğrenci Ad: ${o.ad}")
        println("Öğrenci Sınıf: ${o.sinif}")
    }
    val sonucListe = ogrenciler.filter { it.no > 2 }

    for (o in sonucListe) {
        println("***************************")
        println("Öğrenci No: ${o.no} ")
        println("Öğrenci Ad: ${o.ad}")
        println("Öğrenci Sınıf: ${o.sinif}")
    }
    //Burada 2 dahil öğrenci nosu 2 den büyük olanlari yazdir dedik.
    val sonucListe1 = ogrenciler.filter { it.no >= 2 }

    for (o in sonucListe1) {
        println("***************************")
        println("Öğrenci No: ${o.no} ")
        println("Öğrenci Ad: ${o.ad}")
        println("Öğrenci Sınıf: ${o.sinif}")
    }
    // Burada ise öğrencilerin adında a olanlari filtreleme yapıyor.
    val sonucListe2 = ogrenciler.filter { (it.ad).contains("a") }
    for (o in sonucListe2) {
        println("***************************")
        println("Öğrenci No: ${o.no} ")
        println("Öğrenci Ad: ${o.ad}")
        println("Öğrenci Sınıf: ${o.sinif}")
    }
    val sonucListe3 = ogrenciler.filter { it.sinif == "11F" }
    for (o in sonucListe3) {
        println("***************************")
        println("Öğrenci No: ${o.no} ")
        println("Öğrenci Ad: ${o.ad}")
        println("Öğrenci Sınıf: ${o.sinif}")
    }


}