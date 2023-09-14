package com.example.hellokotlin

import java.util.Scanner

fun main() {

    print("Adinizi Giriniz:")
    val girdi = Scanner(System.`in`)
    val ad = girdi.next()
    print("Soyadinizi Giriniz:")
    val soyad = girdi.next()
    print("Yasinizi Giriniz:")
    val yasiniz = girdi.nextInt()

    println("Adiniz: $ad")
    println("Soyadiniz: $soyad")
    println("Yasiniz: $yasiniz")

    println("""
        
        Adiniz : ${ad.uppercase()}
        Soyadiniz: ${soyad.uppercase()}
        Yasiniz: $yasiniz
        
    """)

}