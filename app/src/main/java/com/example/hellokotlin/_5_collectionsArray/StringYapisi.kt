package com.example.hellokotlin._5_collectionsArray

fun main() {

    val str1 = "Merhaba"
    println(str1)
    // Bu şekilde de tanımlayabiliriz.

    var str2 = String()
    str2 = "Kotlin "
    println(str2)
    val str3 = """
        NASILSIN
        MERHABA
        HEY 
        MAN
        
        
    """.trimIndent()
    println(str3)
    val str4 = "s"
    val str5 = String()

    if (str4.isEmpty()) {
        println("str4 boş")
    }else {
        println("str4 dolu")
    }
    if (str5.isEmpty()) {
        println("str5 boş")
    }else {
        println("str5 dolu")
    }

    val varA = 10
    val varB = 20
    println("$varA X $varB = ${varA*varB}")

    //Birleştirme işlemi
    val str6 = "Merhaba"
    val str7 = "Dünya"
    println(str6 + str7)

    //Kaç tane harf boşluk kelime var olduğunu öğrenmme

    val str8 = "Merhaba,Kotlin !"
    println("$str8 boyutu : ${str8.length}")
    //Kıyaslama yapabiliriz
    val str9 = "Merhaba"
    val str10 = "Dünya"
    if (str9 == str10) {
        println("$str9 ve $str10 eşittir")
    }else {
        println("$str9 ve $str10 eşit değil!")
    }

    val str11 = "Merhaba"
    // For ile kelimeyi harf harf alabiliriz.
    for (s in str11) {
        println(s)
    }

}