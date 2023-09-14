package com.example.hellokotlin._5_collectionsArray

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    var sayac = 1
    val ogrenciler = ArrayList<Ogrenciler>()

    while (true) {

        println("Öğrenci Adi Giriniz:")
        val ad = girdi.next()
        println("Öğrencinin Sinifini Giriniz:")
        val sinif = girdi.next()

        val yeniOgrenci = Ogrenciler(sayac,ad,sinif)
        ogrenciler.add(yeniOgrenci)

        sayac++

        println("Çıkmak için (1) - Devam etmek için diğer sayilar")
        val cikis = girdi.nextInt()
        if (cikis == 1) {
            for (ogrenci in ogrenciler) {
                println("*********************")
                println("Öğrenci No: ${ogrenci.no}")
                println("Öğrenci ad: ${ogrenci.ad}")
                println("Öğrenci Sınıf: ${ogrenci.sinif}")
            }
            println("*****************")
            println("Çıkış Yapildi")
            break
        }



    }




}