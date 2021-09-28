package com.example.basickotlin.Basic.Control

fun main() {

    //when
    var x = 1
    when(x){

        1 -> println("x = 1")
        2 -> println("x = 2")
    else ->{
        println("x tidak memiliki nilai")
    }
    }

    //When Expression Multiple Option

    var nilaiAkhir = "A"
    when(nilaiAkhir){
        "A","B","C" -> println("Kamu lulus ujian dengan predikat $nilaiAkhir")
        else->{
            println("Sukurin Makanya Seriusss")
        }
    }

    //When Expression In

    val nilaiSadBoy = 'D'
    val nilailulus = arrayOf('A', 'B', 'C')
    when(nilaiSadBoy){
        in nilailulus -> println("Ciee Lulus")
        !in nilailulus -> println("Yahhahah Wahyu")
    }

    //When Tanda Variable

    val ujianpertengahan = 70
    when{
        ujianpertengahan >= 90 -> println("Anda pelajar terbaik")
        ujianpertengahan >= 80 -> println("Nilai Anda Cukup")
        else -> println("Luuu Gakkk Lulusss Brooo")
    }
}