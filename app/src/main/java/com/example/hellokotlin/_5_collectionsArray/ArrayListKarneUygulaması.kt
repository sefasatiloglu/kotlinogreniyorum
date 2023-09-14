package com.example.hellokotlin._5_collectionsArray

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)
    val dersNotlariListesi = ArrayList<DersNotlar>()

    while (true) {

        println("Dersin adini giriniz:")
        val ders = girdi.next()
        println("Dersin notunu giriniz:")
        val not = girdi.nextInt()
        val yeniNot = DersNotlar(ders, not)
        dersNotlariListesi.add(yeniNot)


        println("Çıkış Yapmak İçin (1) - Devam etmek için diğer sayilar")
        val cikis = girdi.nextInt()
        if (cikis == 1) {

            var toplam = 0

            println("*************************")
            for (dn in dersNotlariListesi) {
                println("${dn.ders} : ${dn.not}")
                toplam = toplam + dn.not
            }
            val ortalama = toplam / dersNotlariListesi.size
            println("*********************************")
            println("ORTALAMA : $ortalama")

            if (ortalama >= 50) {
                println("Geçtiniz")
            }else {
                println("Kaldiniz!")
            }
            println("Çıkış Yapıldı.")
            break
        }

    }


}