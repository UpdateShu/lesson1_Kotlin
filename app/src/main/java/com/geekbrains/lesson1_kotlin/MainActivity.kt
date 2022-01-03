package com.geekbrains.lesson1_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.geekbrains.lesson1_kotlin.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        val TAG = "MAIN_ACTIVITY"

        fun doSomething() {

        }
    }

    private var btn: Button? = null
    private var btn2: Button? = null
    private var btn3: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        btn?.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@MainActivity, "Hello, world!", Toast.LENGTH_SHORT).show()
        })

        val w = Weather("Москва", -5)
        Repository.addWeather(w, id = 9)
        btn2 = findViewById(R.id.button2)
        btn2?.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@MainActivity, "Температура в городе '" + w.town + "': " + w.temp + "C", Toast.LENGTH_SHORT).show()
        })
        val w1=w.copy(temp = 33)
        btn3 = findViewById(R.id.button3)
        btn3?.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@MainActivity, "Температура в городе '" + w1.town + "': " + w1.temp + "C", Toast.LENGTH_SHORT).show()
        })
        if (w == w1) {
            val t=0
        }
        else {
            val e = 0
        }
        val t2 = w?.town ?: "no town"

        Repository.addWeather(Weather("Волгоград", -5), 9)
        Repository.addWeather(id = 10, weather = w1)
        val weather = Repository.getWeather()

        doSomething()
        val name = appName
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")

        val r = when (v?.id) {
            R.id.button -> {}
            R.id.button2 -> {}
            R.id.button3 -> {}
            else -> {}
        }
    }
}