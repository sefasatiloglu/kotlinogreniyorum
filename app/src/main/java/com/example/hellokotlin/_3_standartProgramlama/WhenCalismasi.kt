package com.example.hellokotlin._3_standartProgramlama

fun main() {

    val gun = 3

    when(gun ) {
        1 -> print("Pazartesi")
        2 -> print("Salı")
        3 -> print("Çarşamba")
        4 -> print("Perşembe")
        5 -> print("Cuma")
        6 -> print("Cumartesi")
        7 -> print("Pazar")
        else -> println("Bu şekilde bir gün yok")
    }



}