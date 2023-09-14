package com.example.hellokotlin._4_nesneTabanliProgramlama

fun main() {

    val bmw = Araba("Beyaz",99,false)
    println(bmw.renk)
    println(bmw.hiz)
    println(bmw.calisiyorMu)

    println("***************Deger Degistirme***********")

    bmw.hiz = 900
    bmw.renk = "Kırmızı"
    bmw.calisiyorMu = true
    println(bmw.hiz)
    println(bmw.renk)
    println(bmw.calisiyorMu)

    println("*****************Fonskiyonlu**************************")

    bmw.bilgiAl()

    println("**************Durdur Fonksiyonu**********************")
    bmw.durdur()
    bmw.bilgiAl()
    println("******************Calistir Fonksiyonu*********************")
    bmw.calistir()
    bmw.bilgiAl()

    println("****************Hızlan Fonksiyonu**************************")

    bmw.hizlan(100)
    bmw.bilgiAl()

    println("*************Yavasla Fonksiyonu******************************")
    bmw.yavasla(60)
    bmw.bilgiAl()

    println("*************Yeni Nesne Oluşturma!**************")

    val skoda = Araba("Sarı",150,true)
    skoda.bilgiAl()
    skoda.renk = "Siyah"
    skoda.bilgiAl()
    skoda.hizlan(50)
    skoda.bilgiAl()
    skoda.durdur()
    skoda.bilgiAl()




/*
    val bmw = Araba()

    println(bmw.renk)
    println(bmw.hiz)
    println(bmw.calisiyorMu)

    println("***************Deger Degistirme*******************")
    bmw.renk = "Beyaz"
    bmw.hiz = 99
    bmw.calisiyorMu = true
    println(bmw.renk)
    println(bmw.hiz)
    println(bmw.calisiyorMu)
*/


}