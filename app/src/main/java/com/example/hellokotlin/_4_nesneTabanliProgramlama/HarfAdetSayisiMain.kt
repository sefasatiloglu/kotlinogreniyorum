package com.example.hellokotlin._4_nesneTabanliProgramlama

fun main() {

    val hrf = HarfAdetSayisi()

    hrf.harfSayisi("Ankara",'a')
    var sayac = 0
    var kelime = "sefasatiloglusefasefa"
    for (i in kelime) {
        println(i)
        if (i == 's') {
            sayac = sayac + 1
        }

    }
    println("Kaç tane geçiyor: $sayac")




}