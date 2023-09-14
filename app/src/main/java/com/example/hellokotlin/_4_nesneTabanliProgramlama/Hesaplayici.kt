package com.example.hellokotlin._4_nesneTabanliProgramlama

class Hesaplayici {

    fun topla(sayi1:Int , sayi2:Int) {
        println("Toplam ${sayi1 + sayi2}")
    }
    //Aynı isimli fonksiyon olunca hata veriyor.
    // Ama Parametreleri değiştirirsek sorun ortadan kalkar.
    /*fun topla(sayi1:Int , sayi2:Int) {
        println("Toplam ${sayi1 + sayi2}")
    }

     */

    fun topla(sayi1:Double , sayi2:Int) {
        println("Toplam ${sayi1 + sayi2}")
    }

    fun topla(sayi1:Int , sayi2:Double) {
        println("Toplam ${sayi1 + sayi2}")
    }

    fun topla(sayi1:Double , sayi2:Int, ad:String) {
        println("Toplam yapan $ad sonuc : ${sayi1 + sayi2}")
    }





    // ya da farklı bir parametre eklersek kullanabiliriz.


}