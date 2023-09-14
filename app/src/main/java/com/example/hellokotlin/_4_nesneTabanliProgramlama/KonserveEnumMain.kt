package com.example.hellokotlin._4_nesneTabanliProgramlama

fun main() {

    fun ucretAl(boyut: KonserveBoyut) {

        when(boyut) {
            KonserveBoyut.Kucuk -> println(20*30)
            KonserveBoyut.Orta -> println(30*30)
            KonserveBoyut.Buyuk -> println(40*30)
        }

    }

    ucretAl(KonserveBoyut.Orta)
    ucretAl(KonserveBoyut.Buyuk)



}