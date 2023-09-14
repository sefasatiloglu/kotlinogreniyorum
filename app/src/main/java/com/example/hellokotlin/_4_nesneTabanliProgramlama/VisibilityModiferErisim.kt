package com.example.hellokotlin._4_nesneTabanliProgramlama

class VisibilityModiferErisim : VisibilityModifier() { // Kalitim yapıyoruz. Siniftan diğer sınıfa kalıtım yaptığımız da protected ' e erişimsağlayabiliyoruz

    fun fonskiyon() {

        val nesne = VisibilityModifier()
        println(nesne.varsayilanDegisken)
        println(nesne.publicDegisken)
        //println(nesne.privateDegisken) // erişemiyoruz (sadece sınıf içinde erişim var)
        println(nesne.internalDegisken)
        //println(nesne.protectedDegisken) // Bu sınıftan türemesi gerekir ondan dolayı erişemiyoruz.


    }

}