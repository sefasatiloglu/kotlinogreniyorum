package com.example.hellokotlin._4_nesneTabanliProgramlama

class Mudur:Personel() {
    fun iseAl(p:Personel) {
        p.iseAlindi()
    }

    fun terfiEttir(p: Personel) {
        if (p is Ogretmen) {
            p.maasArttir()
        }
        if(p is Isci) {
            println("İşciler Terfi Alamaz.")

        }
        //(p as Ogretmen).maasArttir() // DownCasting (üst sınıfı alt sınıfa dönüştürme)
    }

}