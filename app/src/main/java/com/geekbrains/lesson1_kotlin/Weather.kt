package com.geekbrains.lesson1_kotlin

data class Weather(var town: String, val temp: Int, var Id: Int = 1) {
    protected val weathervalue = "protected"
}