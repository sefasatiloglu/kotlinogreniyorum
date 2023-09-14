package com.example.hellokotlin._5_collectionsArray

fun main() {

    val birinciThread = Thread1()
    birinciThread.start()

    val ikinciThread = Thread(Thread2())
    ikinciThread.start()

    for (i in 900..999) {
        println("Main Thread : $i")
        Thread.sleep(100)
    }



}