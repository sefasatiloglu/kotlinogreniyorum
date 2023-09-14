package com.example.hellokotlin._4_nesneTabanliProgramlama

fun main() {

    val m = Matematik()

    m.topla(20,30)
    val cikar = m.cikarma(300.0,200.0)
    println("Çıkarma: $cikar")
    m.carpma(20,10,"sefa")
    val bolme = m.bolme(30.0,15.0)
    println(bolme)


}