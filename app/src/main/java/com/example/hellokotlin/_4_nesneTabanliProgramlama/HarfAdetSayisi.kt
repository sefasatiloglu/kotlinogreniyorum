package com.example.hellokotlin._4_nesneTabanliProgramlama

class HarfAdetSayisi {

    fun harfSayisi(kelime:String,harf:Char) {

        var sonuc = 0

        for (k in kelime) {
            println(k)

            if (k == harf) {
                println(k)
                println(harf)
                sonuc = sonuc +1
            }

        }
        println("Harf Adeti : $sonuc")



    }


}