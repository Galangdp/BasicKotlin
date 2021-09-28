package com.example.basickotlin.Basic

fun main() {
    var sum = 0
    var i = 1
    while (i <= 100){
        sum += i
        i++
        if (sum > 1000){
            break
        }
    }
    println(sum)
}