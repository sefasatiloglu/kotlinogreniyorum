package com.example.hellokotlin._5_collectionsArray

class Thread2:Runnable {

    override fun run() {

        for (i in 200..299) {
            println("İkinci Thread: $i")
            Thread.sleep(100)
        }
    }
}