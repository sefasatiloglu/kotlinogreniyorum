package com.example.hellokotlin._4_nesneTabanliProgramlama

fun main() {

    val kamilKoc = Otobus(50,"Bursa","Ankara",10)

    println(kamilKoc.kapasite)
    println(kamilKoc.nereden)
    println(kamilKoc.nereye)
    println(kamilKoc.mevcutYolcuSayisi)

    println("*******************Degerleri Degistirdikten Sonra************************************")

    kamilKoc.kapasite = 100
    kamilKoc.nereden = "izmir"
    kamilKoc.nereye = "istanbul"
    kamilKoc.mevcutYolcuSayisi = 30

    println(kamilKoc.kapasite)
    println(kamilKoc.nereden)
    println(kamilKoc.nereye)
    println(kamilKoc.mevcutYolcuSayisi)

    println("**********************Bilgi Al Fonksiyonu Yazdım***********************************")
    kamilKoc.bilgiAl()

    println("*****************************Yolcu Al***********************************")
    kamilKoc.yolcuAl(10)
    kamilKoc.bilgiAl()
    println("**************************Yolcu İndir************************************")
    kamilKoc.yolcuIndir(5)
    kamilKoc.bilgiAl()
    println("***************Yeni Nesne Oluşturma*************************************") // Her nesne kendi özelliğine sahiptir. Hiç bir nesne birbirini etkilemez.
    val SecTurizm = Otobus(50,"Gaziantep","İstanbul",30)
    SecTurizm.bilgiAl()
    println("****************************Yolcu Al Fonksiyonu************************************")
    SecTurizm.yolcuAl(30)
    SecTurizm.bilgiAl()
    SecTurizm.yolcuAl(20)
    SecTurizm.bilgiAl()



}