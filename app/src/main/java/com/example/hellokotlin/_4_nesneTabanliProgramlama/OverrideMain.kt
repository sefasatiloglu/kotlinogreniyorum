package com.example.hellokotlin._4_nesneTabanliProgramlama

fun main() {

    val hayvan = Hayvan()
    hayvan.sesCikar()
    val memeli = Memeli()
    memeli.sesCikar()
    val kopek = Kopek()
    kopek.sesCikar()
    val kedi = Kedi()
    kedi.sesCikar()
    //PolyMorphism Kullanimi (Kalitim olması şarttır.)
    val hayvan1:Hayvan = Kopek()
    hayvan1.sesCikar()




}