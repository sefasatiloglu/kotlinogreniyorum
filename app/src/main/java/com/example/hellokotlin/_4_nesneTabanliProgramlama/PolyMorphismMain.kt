package com.example.hellokotlin._4_nesneTabanliProgramlama

fun main() {

    val ogretmen:Personel = Ogretmen()
    val isci:Personel = Isci()

    val mudur = Mudur()

    mudur.iseAl(ogretmen)
    mudur.iseAl(isci)
    mudur.terfiEttir(ogretmen)
    mudur.terfiEttir(isci)


}