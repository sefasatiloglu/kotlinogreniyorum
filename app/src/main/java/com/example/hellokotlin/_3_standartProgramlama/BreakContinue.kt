package com.example.hellokotlin._3_standartProgramlama

fun main() {

    for (i in 1..5) {

        if (i == 3) {
            break

        }
        println("Döngü 1 : $i")

    }
    println("**********************************************************")
    for (x in 1..5) {
        if (x == 3) {
            continue

        }
        println("Döngü 2 : $x")
    }



}