package com.example.basickotlin.Basic.Control

fun main() {
    for (value in 100 downTo 5 step 5)

    //downTo gunanya untuk turun sampai kemana
    //tapi kalau step itu jarak longkap dari angka ke angka

        println(value)

    val name = "Abjad"
//akan memberikan kejelasan tentang huruf sampai dia selesai ngelooping
    for (name in name) {
        //code nyeee
        println("\"$name\"")

    }

    for (number in 1..5) {
        println("nomor $number")

    }
    for (i in 1.rangeTo(5)) {
        println(i)

    }
    for (index in (19.downTo(9) step 3)) {
        println(index)
    }
    val range = 1.rangeTo(9)
    range.forEachIndexed { index, value ->
        println("index $index bernilai $value")
    }
}
