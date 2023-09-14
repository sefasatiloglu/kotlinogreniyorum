package com.example.hellokotlin._3_standartProgramlama

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    println("Toplama (1)")
    println("Cikarma (2)")
    println("Carpma  (3)")
    println("Bolme   (4)")

    val tercih = girdi.nextInt()

    println("Seçiminiz $tercih")

    print("Birinci Sayiyi Giriniz:")
    val sayi1 = girdi.nextInt()
    print("İkinci Sayiyi Giriniz:")
    val sayi2 = girdi.nextInt()

    when(tercih) {
        1-> println("Toplama : ${sayi1 + sayi2}")
        2-> println("Cikarma : ${sayi1 - sayi2}")
        3-> println("Carpma :  ${sayi1 * sayi2}")
        4-> println("Bolme  :  ${sayi1 / sayi2}")
        else -> println("Yanlış Hatali Tuşlama Yaptiniz.")
    }

    for (index in 1..5) { // 1'den 5 kadar 5 de dahil olarak ekrana yazdirir.
        println(index)
    }

    for (index1 in 1 until 5) { // until komutuyla until sayiyi 1 eksiltir. yani 1..4 e kadar yazdirma işlemi yapar.
        println(index1)
    }

    for (index2 in 1..10 step 2) { // step kaç adım gitmesi için burada sayi 2 şer 2 şer atlıyarak gidiyor
        println(index2)
    }
    for (index3 in 10 downTo 0 step 2) { // burada downTo komutu ise 10 dan başlayıp tam tersi olarak step ile 2 şer 2 şer aşağa iniyor.
        println(index3)
    }

    var index4 = 0

    while (index4 < 5 ) {
        println("Sonuc : $index4")
        index4+=1

    }





}