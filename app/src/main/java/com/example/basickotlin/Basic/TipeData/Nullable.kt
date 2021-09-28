package com.example.basickotlin.Basic.TipeData

fun main() {

    //membuat null dan membuat pengecekan dengan if else
    // cara pertama

    val a = 25
    if (a != null){
        println(a)
    }else{
        print("variabel a adalah null")
    }

    // cara kedua untuk mengatasi null
//save calls

    var c : String? = null
    if (c != null) {
        print(c?.length)
    }else{
        println(-1)

    }

//elvis

    val d : String? = "Ucok"
    val l : Int = if (d !=null)d.length else -1
    println(l)

//elvis operator

    val g = d?.length ?: -1
    println(g)

    // Operator
    //gunanya buat memastikan kalo dia itu null atau tidak

    val apage : String? = null
    println(apage!!.length)


}
