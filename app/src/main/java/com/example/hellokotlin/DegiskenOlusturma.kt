package com.example.hellokotlin

fun main() {

    val ogrenciAdi = "Sefa"
    var yasi = 26
    var boy = 1.90
    var adininBasHarfi = "S"

    println(ogrenciAdi)
    println(yasi)
    println(boy)
    println(adininBasHarfi)

    println("**************Urunler*****************")

    var urunId = 3416
    var urunAdi ="Kol saati"
    var urunAdet = 100
    var urunFiyat = 149.99
    var urunTedarikci = "Rolex"

    println(urunId)
    println(urunAdi)
    println(urunAdet)
    println(urunFiyat)
    println(urunTedarikci)

    println("Urun Adi: $urunAdi")

    var ad = "Sefa"
    var yas = 25

    println(yas is Int) // yas değişkenin type öğrenmek için

    // $ işareti ile değişkenleri bu şekilde ekleyebiliyoruz.(String ifadesi içerisinde)
    println("$ad Gaziantep'de $yas yıldır yaşamaktadır.")

    var a = 10
    var b = 20
    var toplam = a + b

    //type Safety eger toplam degiskenine int bir değer atarsam daha sonra onu
    // String değer ataması yapamıyoruz.Bunun ismi ise Type Safety denir.

    println("10 + 20 = $toplam")
    //Degiskenleri bu sekilde değiştirip değer atayabiliriz.
    a = 30
    b = 20
    println("$a + $b = ${a + b }")
    // ${} süslü parantezlerle değişkenlere işlem yaptırabiliriz.
    println("$a sayisini $b sayisi ile topladığımız da sonuc ${a + b} dur ")


        val longText = """
        |Bu, çoklu satırlı bir metin bloğudur.
        |Kotlin programlama dilinde kullanılabilir.
        |Çoklu satırlı metin bloğunun içinde tırnak işaretlerine gerek yok.
        |Özel karakterlerin kaçış dizilerine ihtiyacı yok.
    """.trimMargin()

        println(longText)




}