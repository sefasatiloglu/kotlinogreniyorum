package com.example.hellokotlin

fun main() {

    var i:Int = 42
    var d:Double = 42.45
    var f:Float = 42.89f

    var sonuc1:Int = d.toInt()
    var sonuc2:Double = i.toDouble()
    var sonuc3:Int = f.toInt()

    println(sonuc1)
    println(sonuc2)
    println(sonuc3 )

    var str1 = i.toString() // sayısaldan metine dönüştürme işlemi
    var str2 = d.toString()
    var str3 = f.toString()

    println(str1)
    println(str2)
    println(str3)
    /*
    var tPhone = "534t8"
    var tInt = tPhone.toInt()
    println(tInt) // burada patlıyoruz.
    */


    var strInt = str1.toInt()
    println("hello $strInt")

    //Yöntem1

    var yazi1 = "34T"
    try {
        var x = yazi1.toInt()
        println(x)
    }catch (e:Exception) {
        println("Dönüşümde hata var")
    }

    //Yöntem 2

    var yazi2 = "48t"

    var y = yazi2.toIntOrNull()

    //!= değilse anlamında kullanılır
    if (y != null) {
        println("y : $y")

    }else {
        println("Dönüşümde Hata var")

    }

    //Yöntem 3

    var yazi3 = "67t"

    var z = yazi3.toIntOrNull()

    z?.let {
        println("z : $z")
    }

}
