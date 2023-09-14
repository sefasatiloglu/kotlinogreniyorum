package com.example.hellokotlin._2_typeConversion

import java.util.Scanner

fun main() {


    var a=10;
    var b=5;
    var age = 18
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)

    //Kıyaslama operatörleri

    var status = a > b
    status = a < b

    if (status) {
        println("a > b")



    }
    status = age >=18
    status = age <=18

    println(status)

    var name1 = "Ali"
    var name2 = "Veli"

    //Any türü içerisine her türlü değeri alabilen türlerdir.
    var x:Any = "sali"
    var y:Any = "sali"
    if (x === y) {

    }
    if (name1.equals(name2)) {

    }
    println(name2>name1)


    // Atama operatörleri
    var num1 = 10
    var num2 = 20

    num1 += num2
    println("Num1: $num1")

    var i = 0
    ++i
    i++
    println(i)

    println(++i)
    var g = 10
    var w = 11

    println(w>12 && g > 5 || w>11 && g > 10)


    //input output
    //uygulama geliştirme anında kullanıcı varmış gibi kullanıcan veri alma biçimidir.
    println("LÜtfen yasinizi giriniz:")
    val stAge = readLine()
    println("Lütfen kilonuzu giriniz:")
    val stTotal = readLine()
    println(stTotal)
    val girdi = Scanner(System.`in`)
    println(stAge)

    if (stAge != null && stTotal !=null ) {
        val dAge = stAge.toDouble()
        val dTotal = stTotal.toDouble()
        val end = dTotal / dAge
        println("End : $end")
    }



}