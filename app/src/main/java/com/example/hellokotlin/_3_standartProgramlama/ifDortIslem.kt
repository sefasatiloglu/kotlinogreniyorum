package com.example.hellokotlin._3_standartProgramlama

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    println("Toplama (1)")
    println("Çıkarma (2)")
    println("Çarpma  (3)")
    println("Bölme   (4)")

    val secim = girdi.nextInt()

    println("Seçiminiz $secim")

    print("Birinci Sayiyi Giriniz:")
    val sayi1 = girdi.nextInt()
    print("İkinci Sayiyi Giriniz:")
    val sayi2 = girdi.nextInt()

    if (secim == 1) {
        val toplama = sayi1 + sayi2
        println("Toplam : $toplama")
    }else if (secim == 2) {
        val cikarma = sayi1 - sayi2
        println("Cikarma : $cikarma")
    }else if (secim == 3) {
        val carpma = sayi1 * sayi2
        println("Carpma : $carpma")
    }else if (secim == 4) {
        val bolme = sayi1 / sayi2
        println("Bölme : $bolme")
    }


}