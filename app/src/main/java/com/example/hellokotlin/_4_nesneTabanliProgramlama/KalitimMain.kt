package com.example.hellokotlin._4_nesneTabanliProgramlama

fun main() {
    //Üst sınıf alt sinifin değerlerine ulaşamaz.
    //Alt siniflar üst sınıfların parametrelerine ulaşabilir.
    // Tüm özelliklere ulaşabilir.
    // Arac kısmından arabaya kalıtım yaptık. En son nissan ' ı ise hem aracdan hem araba classında ki özelliklere eriştik.
    val araba = Araba1("Kirmizi","Otomatik","Sedan")

    println(araba.renk)
    println(araba.vites)
    println(araba.kasaTipi)

    val araba2 = Nisan("Mavi","Manuel","Sedan","March")
    println(araba2.renk)
    println(araba2.vites)
    println(araba2.kasaTipi)
    println(araba2.model)

}