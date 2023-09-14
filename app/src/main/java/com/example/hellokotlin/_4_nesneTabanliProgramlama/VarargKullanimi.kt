package com.example.hellokotlin._4_nesneTabanliProgramlama

fun main() {

    fun toplam(vararg sayilar:Int) :Int {

        var sonuc = 0
        for (i in sayilar){

            sonuc = sonuc+i

        }
        return sonuc


    }
    val t1 = toplam(1,2,3,4,5,6,7)
    println(t1 )


}