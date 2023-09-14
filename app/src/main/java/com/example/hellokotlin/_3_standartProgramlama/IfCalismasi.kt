package com.example.hellokotlin._3_standartProgramlama

fun main() {

    var yas = 17
    var isim = "sefa"

    if (yas >= 18) {
        println("Ehliyet Alabilirsin")
    }
    else {
        println("Ehliyet Alamazsin")
    }

    if (isim == "sefa") {
        println("Hosgeldin $isim")
    }
    else {
        println("Kusura Bakmayın Tanımıyorum!")
    }

    if (isim == "Sefsat") {
        println("Merhaba Sefsat")
    }else if(isim == "sefa") {
        println("Merhaba Sefa")
    }else {
        println("Tanımıyorum!")
    }

    var kullaniciAdi = "admin"
    var passWord = 12345

    if (passWord == 12345 && kullaniciAdi == "admin") {
        println("Basarili Giris Yaptiniz!")
    }else {
        println("Giriş yapilamadi")
    }
    // if else kısa kullanimi

    var a = 10
    var b = 10

    if (a == b) println("Eşit") else println("Esit degil!")


}