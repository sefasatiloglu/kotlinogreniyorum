package com.example.hellokotlin._5_collectionsArray

class Ogrenciler(var no:Int,var ad:String,var sinif:String) {

    override fun hashCode(): Int {
        return  this.no
    }

    override fun equals(other: Any?): Boolean {
        if (this.no == (other as Ogrenciler).no) {
            return true
        }else {
            return false
        }
    }


}