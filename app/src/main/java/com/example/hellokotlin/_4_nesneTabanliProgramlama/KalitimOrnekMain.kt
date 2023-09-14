package com.example.hellokotlin._4_nesneTabanliProgramlama

fun main() {

    val saray = Saray(50,5)
    val villa = Villa(20,true)
    val topkapiSarayi = Saray(50,20)


    val villa1:Ev = Villa(5,true)
    //UpCasting


    val ev2 = Ev(2)
    val saray1 = ev2 as Saray
    //Downcasting


    println("Saray Pencere Sayisi: ${saray.pencereSayisi}")
    println("Saray Kule Sayisi: ${saray.kuleSayisi}")
    println("Villa Pencere Sayisi: ${villa.pencereSayisi}")
    println("Villa Garaj Var Mı : ${villa.garajVarmi}")
    // Tip Kontrolü is ile yapılabilir. True False değerler döndürür.
    if (topkapiSarayi is Saray) {
        println("Topkapi Bir Saraydir")
    }else {
        println("Topkapi Bir Saray Değildir.")
    }
    if (saray is Saray) {
        println("Saraydir")
    }else {
        println("Saray Değildir.")
    }




}