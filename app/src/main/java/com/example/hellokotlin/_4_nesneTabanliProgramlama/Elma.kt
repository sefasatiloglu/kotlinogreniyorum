package com.example.hellokotlin._4_nesneTabanliProgramlama

 open class Elma:Squeezable,Eatable {
    override fun howToEat() {
        println("isirilarak yenir")
    }

    override fun howToSqueeze() {
        println("Blender ile suyunu sıkıp içebilirsin.")
    }
}