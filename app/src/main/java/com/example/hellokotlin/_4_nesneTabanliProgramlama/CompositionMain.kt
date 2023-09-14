package com.example.hellokotlin._4_nesneTabanliProgramlama

fun main() {

    val adres = Adres("Gaziantep","Sehitkamil")
    val kisi = KisilerComposition("Sefa",26,adres)

    println("Kişi ad : ${kisi.ad}")
    println("Kişi yas : ${kisi.yas}")
    println("Kişi il : ${kisi.adres.il}")
    println("Kişi ilce : ${kisi.adres.ilce}")




}