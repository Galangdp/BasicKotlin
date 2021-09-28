package com.example.basickotlin

fun main() {
    val number = sumNumber(10, 20, 30, 40, 50)
    println(number)

    val arrayNumber = arrayOf(1, 2, 3, 4)
    println(sumNumber1(arrayNumber))

    val number3 = intArrayOf(10, 20, 30)
    val number2 = sumNumber3(10, 20, 30, 40, 50, *number3)
    println(number2)
}
fun sumNumber(vararg number: Int): Int{
    return number.sum()
}

fun sumNumber1(number1:Array<Int>):Int {
    return number1.sum()
}
fun sumNumber3(vararg number2: Int) : Int{
    return number2.sum()
}