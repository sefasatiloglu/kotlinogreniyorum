package com.example.hellokotlin._4_nesneTabanliProgramlama

fun main() {
    fun Int.carpi(sayi:Int):Int{
        return this * sayi
    }
    val sonuc = 5.carpi(2)
    println(sonuc)
    //infix kullanimi
    infix fun Int.carpi1(sayi:Int):Int{
        return this * sayi
    }
    val sonuc1 = 5 carpi1  3
    println(sonuc1)
}