package com.example.hellokotlin._4_nesneTabanliProgramlama

class Matematik {

    fun topla(sayi1:Int , sayi2: Int) {
        val toplam = sayi1 + sayi2
        println("Toplam : $toplam")
    }

    fun cikarma(sayi1: Double , sayi2: Double) : Double {

        return sayi1 - sayi2

    }

    fun carpma(sayi1: Int,sayi2: Int,isim:String) {
        val sonuc = sayi1 * sayi2
        println("Çarpma Yapan $isim Sonuc : $sonuc")
    }
    fun bolme(sayi1: Double , sayi2: Double):String {
        return  "Bölme : ${sayi1 / sayi2}"
    }


}