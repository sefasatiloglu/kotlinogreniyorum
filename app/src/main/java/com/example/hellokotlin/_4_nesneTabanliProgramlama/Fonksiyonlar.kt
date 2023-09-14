package com.example.hellokotlin._4_nesneTabanliProgramlama

fun main() {

    fun selamla() {

        val sonuc = "Merhaba Sefa"
        println(sonuc)

    }



    fun selamla1():String {

        val sonuc = "Merhaba Cevdet"
        return sonuc

    }


    fun selamla2(isim:String) {
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }
    selamla()
    val gelenSonuc = selamla1()
    println(gelenSonuc)
    selamla2("Satıloglu")

    fun toplama() {
        val toplam = 30 + 40
        println("Toplam : $toplam")
    }

    toplama()

    fun toplama1():Int {
        val toplam = 30 + 90
        return toplam
    }

    val gelenToplam = toplama1()
    println("Toplam $gelenToplam")

    fun toplama2(sayi1:Int,sayi2:Int):Int {
        val toplam = sayi1 + sayi2
        return toplam

    }

    val gelenToplam2 = toplama2(100 , 200)
    println("Toplam $gelenToplam2")
}