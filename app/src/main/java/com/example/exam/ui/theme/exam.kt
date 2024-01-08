package com.example.exam.ui.theme

import kotlin.math.PI
import kotlin.math.pow

fun main() {

    //16
    val a = 5
    val b = 10
    val result = minValue(a,b)

    //17
    println(exam(A = 6))

    //18

    //19
    Book("Veliev")


    //20
    val triangle = Triangle(5.0, 10.0, 25.0, 7.0)
    println(triangle.calculateArea())
    println(triangle.calculatePerimeter())

    val rectangle = Rectangle(55.0, 25.0)
    println(rectangle.calculateArea())
    println(rectangle.calculatePerimeter())

    val circle = Circle(9.0)
    println(circle.calculateArea())
    println(circle.calculatePerimeter())




}

//16
fun minValue(a: Int, b: Int){
    if (a > b) println(b) else println(a)
}

//17
fun exam(A: Int): Boolean{
    if (A % 2 == 0){
        return true
    }
    return false
}


//18


//19
class Book(private val title: String){
    constructor(title: String, author: String): this(title)
}


//20
abstract class Shape{
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}
class Triangle(private val a: Double,
               private val h: Double,
               private val c: Double,
               private val b: Double): Shape() {

    override fun calculateArea(): Double {
        return 0.5 * a * h
    }

    override fun calculatePerimeter(): Double {
        return a + b + c
    }
}

class Rectangle(private val a: Double, private val b: Double): Shape() {
    override fun calculateArea(): Double {
        return a * b
    }

    override fun calculatePerimeter(): Double {
        return 2 * (a + b)
    }
}

class Circle(private val r: Double): Shape() {
    override fun calculateArea(): Double {
        return PI * r.pow(2)
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * r
    }
}





