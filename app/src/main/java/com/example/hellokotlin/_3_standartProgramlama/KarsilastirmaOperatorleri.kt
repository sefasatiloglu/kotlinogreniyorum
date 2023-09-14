package com.example.hellokotlin._3_standartProgramlama

fun main() {

    var s1 = 60
    var s2 = 50

    var y1 = 70
    var y2 = 80

    println(s1 == s2) //eşit ise - false
    println(s1 != s2) // eşit değilse - true
    println(s1 > s2) // büyük mü? - true
    println(s1 >= s2) // eşit ve büyük mü? - true
    println(s1 < s2) // küçük mü ? - false
    println(s1 <= s2) // eşit ve küçük mü? - false

    //Mantıksal operatörler

    // || or işareti bir koşulun sağlanması yeterli true döner
    println(s1>s2 || y1>y2) // true
    // && and işareti her iki koşulun sağlanması durumunda true döner
    println(s1>s2 && y1>y2) // false


}