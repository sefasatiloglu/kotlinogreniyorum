package com.example.hellokotlin._4_nesneTabanliProgramlama

class MaasHesaplama {

    fun hesapla(gunSayisi:Int):Int {

        // 1 günde 8 saat çalışabilir
        //Calisma saat ücreti : 10 tl
        //Mesai saat ücreti : 20 tl
        // 160 saat üzeri mesai sayılır

        val hesaplama = gunSayisi * 8
        println("Calışma Saati : $hesaplama")
        var maas = 0
        if (hesaplama > 160) {
            val mesaiFazlasi = hesaplama - 160
            maas = (160*10 )+ (mesaiFazlasi * 20)

        }else {
            maas = hesaplama * 10
        }
        return maas


    }


}