package com.example.weatherapp.models

import java.io.Serializable

data class Main(
    val temp:Double,
    val feels_like:Double,
    val temp_min:String,
    val temp_max:String,
    val pressure:Int,
    val humidity:Int,
    val sea_level:Int,
    val gmd_level:Int
):Serializable
