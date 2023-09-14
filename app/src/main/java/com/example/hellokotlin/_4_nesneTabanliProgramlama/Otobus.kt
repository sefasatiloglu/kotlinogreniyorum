package com.example.hellokotlin._4_nesneTabanliProgramlama

class Otobus (var kapasite:Int, var nereden:String , var nereye:String, var mevcutYolcuSayisi:Int) {

    fun yolcuAl(yolcu:Int) {
        if (mevcutYolcuSayisi > 50 ) {
            println("Mevcut yolcu sayisi doludur.")
        }else {
            mevcutYolcuSayisi = mevcutYolcuSayisi + yolcu
        }


    }

    fun yolcuIndir(yolcu: Int) {
        mevcutYolcuSayisi = mevcutYolcuSayisi - yolcu

    }

    fun bilgiAl() {
        println("Kapasite Sayisi: $kapasite")
        println("Nereden: $nereden")
        println("Nereye: $nereye")
        println("Mevcut Yolcu Sayısı: $mevcutYolcuSayisi")
    }

}