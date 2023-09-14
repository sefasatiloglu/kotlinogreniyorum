package com.example.hellokotlin._4_nesneTabanliProgramlama

class InternerUcreti {

    fun hesapla(kotaMiktari:Int):Int {

        //50 GB  100 TL
        //Kota aşımmından sonra her 1GB 4 TL

        var ucret = 0

        if (kotaMiktari > 50) {
            var kotaFazlasi = kotaMiktari - 50
            ucret = 100 + kotaFazlasi*4
            println("Kota Miktarınızı Aştınız. Aşılan Kota Miktarı: $kotaFazlasi GB")
        }else {
            ucret = 100
            println("Kalan Kotanız : ${50-kotaMiktari} GB")
        }
        return ucret
    }


}