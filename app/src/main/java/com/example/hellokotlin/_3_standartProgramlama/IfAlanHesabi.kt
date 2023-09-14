package com.example.hellokotlin._3_standartProgramlama

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    println("Dikdörtgen Alani (1)")
    println("Çember Alani (2)")

    val secim = girdi.nextInt()

    println("Seçiminiz: $secim")

    if (secim == 1) {
        println("Kısa Kenar Giriniz")
        val kisiKenar = girdi.nextInt()

        println("Uzun Kenar Giriniz")
        val uzunKenar = girdi.nextInt()

        println("Dikdörtgenin Alani")
        val sonuc = kisiKenar*uzunKenar
        println("Sonuc : $sonuc")
    }
    if (secim == 2) {

        println("Yari cap giriniz")
        val yariCap = girdi.nextInt()

        println("Çember Alani")
        val sonucAlan = 3.14*yariCap*yariCap
        println("Sonuc: $sonucAlan")

    }
}