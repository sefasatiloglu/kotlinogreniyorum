package com.example.hellokotlin

import java.util.Scanner

fun main() {

    //Tanımlama

    // Dizileri Genellikle Val olarak tanımlanır.

    val dizi1 = Array<Int>(5) {0} //[0,0,0,0,0] genellikle boş dizi tanımlama

    val dizi2 = arrayOf(1,10,7)
    println(dizi2.size) // dizinin boyunu büyüklüğünü görüntüleyebiliriz. //Sonuc 3
    println(dizi2.contentToString())

    val dizi3 = arrayOf<Int>(1,34,9)
    println(dizi3.contentToString())

    val dizi4 = arrayOf<String>("Cilek","Ahmet","Mehmet") // Genel kullanım

    val dizi5 = arrayOf(3,8,"Elma","Gaziantep") // Hem string hem integer değer de atayabiliriz.

    val meyveler = arrayOf<String>("Cilek","Muz","Elma","Kivi","Kiraz")

    // Verilere Erişim

    //Array boyutu aynıdır. Ama var olan elemanları değiştirebiliriz.

    val str3 = dizi3[1]
    println(str3)
    val str1 = meyveler[2]
    println(str1)

    val str5 = dizi3.get(1)
    println(str5)
    val str2 = meyveler.get(3) // verileri almak için 'get'

    println(str2)

    //Veri üzerinde işlem yapma

    meyveler[1] = "Yeni Muz"
    println(meyveler.contentToString()) // Dizinin içeriğine erişmek tüm elemanları gösterir.

    meyveler.set(2,"Yeni elma") // verilere değiştirmek için 'set' kullanıyoruz.

    println(meyveler.contentToString())

    println("*************Denemeler*****************************")
    println(dizi3.get(2))
    println(dizi3[dizi3.size-1]) // son elemana bu şekilde ulaşabiliriz.
    println(dizi3[0]) // ilk elemana ulaşmak

    dizi3.set(2,10)
    println(dizi3.contentToString())
    dizi3[2] = 15
    println(dizi3.contentToString())

    //Array işlemleri (methotları)

    println(meyveler.isEmpty()) // True False döner (Dizi boş mu dolu mu?)
    println(meyveler.count()) // dizinin boyutu
    println(meyveler.first()) // ilk elemanı gösterir
    println(meyveler.last()) // son elemanı gösterir
    println(meyveler.indexOf("Kivi")) // Elemanın ismini yazarak index numarasına erişebiliriz.
    println(meyveler.contains("Muz")) // Bu dizi içerisinde Muz var mı ? (True-False) döner
    println(meyveler.max()) // Harf sirasına göre siralar en büyük Z harfi
    println(meyveler.min()) // Harf sirasina göre en küçük A harfi
    println(meyveler.sort()) // Harf sirasina göre listenir.
    println(meyveler.contentToString())
    println(meyveler.reverse()) // Diziyi terse çevirme
    println(meyveler.contentToString())

    println("****************Methot Denemeleri*****************************")
    val sehirler = arrayOf<String>("Gaziantep","İstanbul","Bursa","Ankara","Antalya")
    println(sehirler.contentToString())
    println(sehirler.isEmpty()) //Dizi boş mu kontrolü yapıyor.
    println(sehirler.count())  //Dizinin boyutu
    println(sehirler.first()) // Dizinin ilk elemanı gösterir.
    println(sehirler.last()) // Dizinin son elemanını gösterir.
    println(sehirler.indexOf("Antalya"))
    println(sehirler.contains("Bursam"))
    println(sehirler.contains("Ankara"))
    println(sehirler.max())
    println(sehirler.min())
    println(sehirler.sort())
    println(sehirler.contentToString())
    println(sehirler.reverse())
    println(sehirler.contentToString())
    println("**********************Finish***********************************")

    println("**********************Dizi Döngüler**********************")

    //Diziler Döngüleri Kullanımı

    val meyveler1 = arrayOf<String>("Cilek","Muz","Elma","Kivi","Kiraz")

    for(meyve in meyveler1) {
        println(meyve)
    }
    // Meyve içeriğinin sol tarafina index numaralarini yazdıracak.

    for ((indeks,meyve) in meyveler.withIndex()) {
        println("Sonuc : $indeks : $meyve")

    }

    //foreach kullanimi

    meyveler1.forEach {
        println(it)
    }

    val str4 = """
        
        Merhaba 
        Ben     Sefa 
        Senin adın nedir ?
        """.trimIndent() // sol tarafinda ki boşluklari temizler.
    println(str4)

    println("*******************Diziler Döngüler Kullanımı************************************")


    val sehirler1  = arrayOf<String>("Gaziantep","Antalya","İstanbul","Eskisehir","Ankara","Bursa")

    for (sehir in sehirler1) {
        println(sehir)
    }

    for ((index,sehir) in sehirler1.withIndex()) {
        println("${index + 1} - $sehir")
    }
    sehirler1.forEach { it
        println(it)

    }




    println("**********************************************************************************")
/*
Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı girin:");
        int number = scanner.nextInt();

        System.out.println("Girdiğiniz sayı: " + number);

        scanner.close(); // Scanner'ı kapatmayı unutmayın!

*/

//1.Örnek (5 kişinin ismini konsoldan girerek kayıt işlemini yapınız ve girilen isimleri ekranda gösterin)
//Konsol girdisi
val girdi = Scanner(System.`in`)

// {"","","","",""} bu şekilde boş bir dizi oluşturduk



val isimler = Array<String>(5) { "" }
// until kotlinde bir aralığı temsil eder until başlangıç değerinden(dahil değil)
// örnegin 0 until 5 ifadesi 0,1,2,3,4 sayilarinı içeren bir aralığı temsil eder
// 5 bu aralığın bir parçası değildir. Çünkü until ifadesi bitiş değerini dahil etmez
for (i in 0 until isimler.count()) {

    println("${i+1}. isim giriniz:")
    val isim = girdi.next() // String türünde konsoldan değer alma
    isimler[i] = isim
}
//index numarasini almak için withIndex kullanırız.
for ((indeks,isim) in isimler.withIndex()) {

    println("${indeks+1}. isim : $isim")


}
println(isimler.contentToString())




}