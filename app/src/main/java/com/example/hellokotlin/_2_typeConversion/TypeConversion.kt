package com.example.hellokotlin._2_typeConversion

fun main(args: Array<String>) {
    // Tür dönüşümü
    // bir değer kullanicidan,servisten yada DB den String olarak gelir,
    // bu string ifadelerden bazılari tür dönüşümüne ihtiyaç duyar
    // Gelen değerin hesaplanması vb işlemler için kullanılır

    val stNum1 = "10"
    val stNum2 = "50"



    var num1 = stNum1.toInt()
    var num2 = stNum2.toInt()

    var calNumbers = num1 * num2
    println(calNumbers)

    val id = arrayOf(1,2,3,4,5)
    val firstId = id[0] // Listenin ilk elemanı
    val lasted = id[id.size-1] // Listenin sonunda ki elemanı yazdirir.

    println(firstId)
    println(lasted)

    val asc = Array(5,{i -> i*2 }) //asc[0,2,4,6,8]
    println(asc.contentToString()) // Tüm elemanları görüntülenme

    val asc1 = Array(10,{i -> i * 3  })
    println(asc1.contentToString())

    // n bir boşluk bırakır aşağıdan t-> tab kadar boşluk bıraktı

    val text1 = "Hello, JavaTpoint"
    val text2 = "Hello, JavaTpoint\n"
    val text3 = "Hello, \nJavaTpoint" //Hello, dan sonra \n yaptığımız için bir boşluk bırakara aşağa iniyor
    val text4 = "Hello\t JavaTpoint"

    println(text1)
    println(text2)
    println(text3)
    println(text4)

    val textt1 = """
        Welcome
           To
        JavaTpoint
    """//.trimIndent() // solda ki boşlukları siler.
    println(textt1)

    //Kotlin Type Conversion
    //Tip dönüşümleri
    var value1 = 100
    val value2:Long = value1.toLong()
    println(value2)

    //2.Örnek

    val sayi1 = "100"
    val sayi2 = "250"

    //Burada ki değerler string olarak ama bunların üzerinde işlem yapamıyoruz
    // Eğer tip dönüşümü yaparsak Int işlemleri matematiksel işlem yapabiliriz.
    // Tip dönüşümü için "toInt" methodunu kullanıyoruz.

    var num10 = sayi1.toInt() // sayi1 de ki string değeri integer değere dönüştürdük.
    var num11 = sayi2.toInt()

    //Çıktıda göründüğü gibi string ifadeyi + ile toplarsak 100250 sonucuna ulaşırsın.
    println("$sayi1 + $sayi2 = ${sayi1+sayi2}")
    // Tip dönüşümü yaptıktan sonra
    println("$sayi1 + $sayi2 = ${num10+num11}")
    /*toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()*/
    //Diğer tip dönüşümleri yukarıdaki gibi kullanabiliriz.

}