package com.example.hellokotlin._4_nesneTabanliProgramlama

class Araba (var renk:String , var hiz:Int , var calisiyorMu:Boolean) {

    fun calistir() {
        calisiyorMu = true
    }

    fun durdur() {

        calisiyorMu = false
        hiz = 0

    }

    fun hizlan(kacKm:Int) {
        hiz = hiz + kacKm
    }

    fun yavasla(kacKm: Int) {
        hiz = hiz - kacKm
    }

    fun bilgiAl() {
        println("Renk $renk")
        println("Hiz $hiz")
        println("Calişiyor Mu ? $calisiyorMu")
    }


}

/*
class Araba {

    var renk:String = "Kırmızı"
    var hiz:Int = 10
    var calisiyorMu:Boolean = false



}
*/
