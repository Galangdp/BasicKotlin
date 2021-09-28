package com.example.basickotlin.Basic.TipeData

fun main() {
    val friends: Array<String> = arrayOf("Gw", "Korban", "Ghosting")
// kode Array
    for (i in friends) {
        println(i)
        //cara manggilnya gini brayy
    }


//index di mulai dari 0 , contoh "Gw","Korban","Ghosting"
//cara perhitungan Gw = 0 , Korban = 1 , Ghosting = 3

    friends.set(1,"Galang")
    println(friends[1])


    //friends.set(index=1nya=Galang, "buat ubah data gw"
    //println(friends/nama variable [nomor index yang di ganti])


    val buaya : Array<String?> = arrayOfNulls(5)
    buaya.set(0, null)
    buaya.set(1, null)

    for (i in buaya){
        println(i)
    }



}
