package com.example.hellokotlin

fun main() {


    //do -while
    //dönme koşulu sağlanmasa bile en az bir sefer dönen döngüdür.

    val status = false
    var ii= 0
    do {
        println("Call")
        ii++
    }while (ii<5)

    //break - continue
    // break -> döngüyü durdurmak için kullanılır.
    val name = "Kaan"
    val names = arrayOf("Ali","Veli","Asya","Kaan","Zehra","Ayse")

    for (item in names) {

        if (item.equals("Veli")) {
            continue
        }

        if (item.equals(name)){
            println("Kaan bulundu!")
            break
        }
        println("For loop.. $item" )
    }

    for (i in 0..10) {
        for (j in 0..10) {
            println("j - $j")
            if (j == 5) {

                break
            }
        }
    }

    //Fonksiyonlar
    // fun anahtar kelimesi ile başlar
    // isimlendirme alırlar fun sum()
    //parametre alırlar fun sum(num1:Int , num2:Int)
    // return geri dönüş değeri alırlar.
    val total = sum(55,88)
    println(total)


    }

fun sum(num1:Int , num2:Int) : Int {
    //body
    val toplam = num1 + num2
    return toplam
}