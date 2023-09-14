package com.example.hellokotlin._4_nesneTabanliProgramlama

fun main() {

    val k1 = Kategorilerr(1,"Dram")
    val k2 = Kategorilerr(2,"Komedi")
    val k3 = Kategorilerr(3,"Gerilim")
    val y1 = Yonetmenler(1,"Nuri Bilge Ceylan")
    val y2 = Yonetmenler(2,"Quentin Tarantino")
    val y3 = Yonetmenler(3,"Togan Gökbakar")
    val y4 = Yonetmenler(4,"Faruk Aksoy")

    val f1 = Filmler(1,"Django",2013,k1,y2)

    val f2 = Filmler(2,"Recev İvedik",2008,k2,y3)

    val f3 = Filmler(3,"Fetih 1453",2012,k3,y4)

    println("******************FİLM-1*************************")
    println("Film id : ${f1.film_id}")
    println("Film adi : ${f1.film_ad}")
    println("Film yili : ${f1.film_yil}")
    println("Film Kategori : ${f1.kategori.kategori_ad}")
    println("Film Yönetmeni: ${f1.yonetmen.yonetmen_ad}")

    println("******************FİLM-2*************************")
    println("Film id : ${f2.film_id}")
    println("Film adi : ${f2.film_ad}")
    println("Film yili : ${f2.film_yil}")
    println("Film Kategori : ${f2.kategori.kategori_ad}")
    println("Film Yönetmeni : ${f2.yonetmen.yonetmen_ad}")

    println("******************FİLM-3*************************")
    println("Film id : ${f3.film_id}")
    println("Film adi : ${f3.film_ad}")
    println("Film yili : ${f3.film_yil}")
    println("Film Kategori : ${f3.kategori.kategori_ad}")
    println("Film Yönetmeni : ${f3.yonetmen.yonetmen_ad}")



}