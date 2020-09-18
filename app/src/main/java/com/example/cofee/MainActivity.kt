package com.example.cofee

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : Activity() {
    private var amount = 0
    private var chocolate = 0

    private var minus: Button? = null
    private lateinit var plus: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        minus = findViewById(R.id.minus)
        plus = findViewById(R.id.plus)
        minus!!.setOnClickListener { minus(Constants.COFFEE_TYPE) }
        plus.setOnClickListener { plus(Constants.COFFEE_TYPE) }

        //просто
        amount_coffee.text = amount.toString()
    }

    private fun minus(type: Int) {
        when (type) {
            Constants.CHOCOLATE_TYPE -> {
                amount_chocolate.text = chocolate--.toString()
            }
            Constants.COFFEE_TYPE -> {
                amount_coffee.text = amount--.toString()
            }
        }
    }

    private fun plus(type: Int) {
        when (type) {
            Constants.CHOCOLATE_TYPE -> {
                amount_chocolate.text = chocolate++.toString()
            }
            Constants.COFFEE_TYPE -> {
                amount_coffee.text = amount++.toString()
            }
        }
    }
}