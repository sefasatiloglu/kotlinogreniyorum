package com.example.hellokotlin

fun main() {

    //when

    val day = "Pazartesi"
    if (day.equals("Pazartesi")) {
        println("Pazartesi")
    }
    else if (day.equals("Salı")) {
        println("Salı")
    }
    else if (day.equals("Carsamba")) {
        println("Carsamba")
    }
    else if (day.equals("Persembe")) {
        println("Persembe")
    }else {
        println("Doğru gün seçiniz.")
    }

    val returnData = when(day) {
        "Pazar","Pazartesi","Salı" -> "Şart 1 - Sağlandi."
        "Carsamba","Persembe","Sali"-> "Şart 2 - Sağlandi"
        else -> "Hiç bir şart sağlanmıyor"
    }
    println(returnData)

    // for loop
    val arr = arrayOf("İstanbul","Ankara","Adana","Bursa","Samsun","İzmir","Antalya")

    for (item in arr) {
        println(item)
        for (char in item) {
            print(char)
        }
    }
    println()
    val city = "Gaziantep"


    for ((index, item) in arr.withIndex()) {
        for ((charIndex, char) in item.withIndex()) {
            print(char)
            if (charIndex < item.length - 1) {
                print("-")
            }
        }
        println()
    }



    for (item in arr) {
        var kelimeYakalama = ""
        for ((index, char) in item.withIndex()) {
            kelimeYakalama += char
            if (index < item.length - 1) {
                kelimeYakalama += "-"
            }
        }
        println(kelimeYakalama)
    }
    for (i in 10 downTo 0 step 3) {
        println("i $i")
    }

}