package com.example.hellokotlin._5_collectionsArray

fun main() {

    val u1 = Urun(1,"Saat",150.0)
    val u2 = Urun(2,"TV",1750.0)
    val u3 = Urun(3,"Bilgisayar",960.0)

    val urunler = ArrayList<Urun>()

    urunler.add(u1)
    urunler.add(u2)
    urunler.add(u3)

    for (urun in urunler) {
        println("***********")
        println("Ürün No: ${urun.urunNo}")
        println("Ürün Ad: ${urun.urunAd}")
        println("Ürün fiyat : ${urun.urunFiyat}")
    }


}