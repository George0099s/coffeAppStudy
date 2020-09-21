package com.example.cofee

import android.util.Log

class Student(name: String, age: Int): Person(age, name){
    var grade: Int? = null

    override fun sayHello(): String{
        return "Hello, im $name $grade"
    }
}