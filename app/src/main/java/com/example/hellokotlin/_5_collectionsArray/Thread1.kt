package com.example.hellokotlin._5_collectionsArray

class Thread1 : Thread() {

    override fun run() {

        for (i in 100..199) {
            println("Birinci Thread : $i")
            Thread.sleep(100)
        }

    }



}