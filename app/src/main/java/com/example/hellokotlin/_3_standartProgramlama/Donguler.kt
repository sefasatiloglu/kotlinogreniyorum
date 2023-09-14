package com.example.hellokotlin._3_standartProgramlama

fun main() {

    for (i in 3..5) { //3,4,5
        println(i)
    }

    //10 ile 20 arasinda 5 ' er
    var baslangic = 10
    var bitis = 20
    var artisOrani = 5

    for (a in baslangic..bitis step artisOrani) {
        println("a: $a")
    }

    println("*************************************************")

    for (a in 10..20 step 5) {
        println("a: $a")
    }

    println("**************************************************")

    for (i in bitis downTo baslangic step artisOrani) {
        println("i: $i")
    }

    println("****************************************************")
    for (i in 20 downTo 10 step 5) { // downTo ise tersten yazdirma için kullaniyoruz.
        println("i: $i")
    }

    for (i in 10 until 20 ) { // until: son değeri dahi etmiyor.
        println(i)
    }

    var sayac = 1

    while (sayac < 4 ) {
        println("sayac : $sayac")
        sayac+=1

    }

    //index yazdirma

    var sayac1 = 3

    while (sayac1 < 6) {
        println("$sayac1")
        sayac1 = sayac1 + 1
    }

    for (i in 0..8 step 2) {
        println(i)
    }

    var sayac2 = 0
    while (sayac2 < 9) {
        println("Sayac $sayac2")
        sayac2+=2
    }

    for (i in 8 downTo 0 step 2) {
        println(i)
    }

    var sayac3 = 8

    while (sayac3 > -1) {
        println("Sayac $sayac3")
        sayac3-=2
    }
}