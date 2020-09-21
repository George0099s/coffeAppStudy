package com.example.cofee

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : Activity() {
    private var amount = 0
    private var chocolate = 0
    var s = 0
    val sw = 0
    private var minus: Button? = null
    private lateinit var plus: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val person = Person("MAx12")
        val person2 = Person(12, "Max")
        val student = Student("Vasya", 12)
        val teacher = Teacher("Im", 20, "android")
        val cat = Cat()

        Log.d(TAG, "onCreate: ${cat.sayHello()}")
        student.grade = 3

        val people: List<Person> = arrayListOf(teacher, student)



        for (item in people){
            Log.d(TAG, "onCreate: ${item.sayHello()}")
        }

        setContentView(R.layout.main_activity)
        minus = findViewById(R.id.minus)
        plus = findViewById(R.id.plus)
        minus!!.setOnClickListener { minus(Constants.COFFEE_TYPE) }
        plus.setOnClickListener { plus(Constants.COFFEE_TYPE) }

        //просто
        amount_coffee.text = amount.toString()
        goTo.setOnClickListener {
            start()
        }
        btnSend.setOnClickListener {
            sendEmail()
        }

    }

    private fun sendEmail() {
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:")
        intent.putExtra(Intent.EXTRA_EMAIL, arrayListOf("address@mail.com"))
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
        startActivity(intent)

    }

    private fun start() {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("key", "123")
        intent.putExtra("key1", Data(123, "13"))// реализует parcelable
        startActivity(intent)
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

    companion object {
        const val TAG = "MainActivity"
    }
}