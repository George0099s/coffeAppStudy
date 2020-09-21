package com.example.cofee

open class Person: Interface{
    override fun sayHello(): String {
        return " "
    }


    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    var age: Int? = null
    lateinit var name: String


    fun voice(): String{
       return "hello, $name "
    }

    var height: Int? = null



    constructor(age: Int?){
        this.age = age
    }
    constructor()

    constructor(name: String){
        this.name = name
    }


    constructor(age: Int?, name: String){
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return "$name $age"
    }
}