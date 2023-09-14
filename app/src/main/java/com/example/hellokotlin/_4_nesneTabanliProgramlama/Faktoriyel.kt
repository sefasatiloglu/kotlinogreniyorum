package com.example.hellokotlin._4_nesneTabanliProgramlama

class Faktoriyel {

    fun faktoriyelHesaplama(sayi:Int):Int {

        var sayac = 1
        for (i in 1..sayi) {
            sayac = sayac * i
            println("sayac:$sayac")
            println("i degeri:  $i")
        }
        return sayac


    }


}