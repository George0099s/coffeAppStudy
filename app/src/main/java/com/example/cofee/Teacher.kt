package com.example.cofee

import javax.security.auth.Subject

class Teacher(name: String, age: Int, subject: String): Person(age, name) {
    var subject: String = subject
    override fun sayHello(): String {
        return "hello, $name $subject"
    }
}