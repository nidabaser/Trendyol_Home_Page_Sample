package com.example.listelemeodevi

import java.io.Serializable

data class Urunler(var urunId:Int,
                   var urunResimAdi:String,
                   var urunMarka:String,
                   var urunAdi:String,
                   var urunFiyat:Double) : Serializable {



}