package com.example.hellokotlin._3_standartProgramlama

import java.util.Scanner

fun main() {

    val isim = "sefa"

    for (i in 1..10) {
        println("$i : $isim")
    }

    val girdi = Scanner(System.`in`)

    print("İsim Giriniz:")

    val isim2 = girdi.next()

    print("Tekrar sayisini Giriniz")
    val tekrar = girdi.nextInt()

    for (i in 1..tekrar) {
        println("$i $isim2")
    }



}