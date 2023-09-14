package com.example.hellokotlin._5_collectionsArray

fun main() {

    val dizi1 = ArrayList<String>()

    dizi1.add("Sefa")
    dizi1.add("Cevdet")
    dizi1.add("Remile")
    dizi1.add("Nedim")
    dizi1.add("Sercan")
    dizi1.add("Burcin")

    var str = dizi1.get(1)
    println(str)
    println(dizi1.toString())

    println(dizi1[2])

    dizi1[1] = "Ege"
    println(dizi1.toString())
    dizi1.add(1,"Cevdet") // bu veriyi 1.indekse kaydediyor. 1.index de olanı sağ kaydırıyor.
    println(dizi1.toString())


}