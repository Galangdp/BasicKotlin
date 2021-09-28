package com.example.basickotlin.Basic.TipeData

fun main() {
    val a = "Galang"
    val b = " Davian"
    val alamatRumah = """
        |Gak Punya Rumah
        |Di Dayeuh
        |Adanya Di Sorga
        """.trimMargin()

    //Cara lain enter atau ngasih jarak text  seperti /n
    //trim margin  ke kanan semua tapi bisa di ubah ke kiri

    print(a)
    println(b)
    println(alamatRumah)


    val smk = "Santri"
    val idn = "Teladan"
    val test = smk + " " + idn

    //belajar menggabungkan kata string smk idn

    println(test)

    val kecebong = "Mie"
    val aer = "Ayam"
    val got = "$kecebong ${aer.length}"

    println(kecebong)
    println(aer)
    println(got)
}