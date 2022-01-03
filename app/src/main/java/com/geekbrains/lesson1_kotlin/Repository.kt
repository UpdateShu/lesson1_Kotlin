package com.geekbrains.lesson1_kotlin

import android.util.Log

object Repository {
    private val weatherList: MutableList<Weather>
    private var weatherListN: List<Weather> = arrayListOf()
    private var weatherListA: ArrayList<Weather>? = arrayListOf()
    private var otherList = arrayListOf<Weather>(Weather("Saratov", 20))

    init {
        weatherList = arrayListOf(Weather("Воронеж", 15), Weather("Уфа", 22))
        otherList.add(Weather("Vladivostok", 15))
    }

    fun getWeather() : List<Weather> {
        otherList = arrayListOf()
        for (w in weatherList) {
            Log.d("Weather", w.town + ": " + w.temp + "C")
        }
        for (i in 10 downTo 1 step 2) {
            Log.d("Step_down", i.toString())
        }
        return weatherList;
    }

    fun addWeather(weather: Weather, id: Int) {
        weatherList.add(weather)
    }

    fun getItemCount() = weatherList.size
}