package com.example.basickotlin

fun main() {

var jam = 6
    when(jam){
        in 1..5 -> println("Jadi Anda Bayar Parkir Sebanyak \$${jam * 1.0}")
        in 6..23 -> println("Jadi Anda Bayar Parkir Sebanyak \$${((jam - 5.0)* 0.5) + 5}")
        else -> println("Jadi Anda Bayar Parkir Sebanyak \$${(jam % 24.0) * 0.5 + (jam/24 * 15)}")
    }
hitungParkir(49)
}


fun hitungParkir(waktu:Int) {
    if (waktu >= 0 && waktu <=5) {
        print("tagihan parkir sebanyak $${waktu * 1}")
    }else if (waktu > 5 && waktu <= 24){
        print("tagihan parkir sebanyak $${5 + ((waktu - 5)*0.5)}")
    }else if (waktu % 24 == 0){
        print("tagihan parkir sebanyak $${(waktu/24)*15}")
    }else if (waktu > 24){
        print("tagihan parkir sebanyak $${(waktu / 24) * 15 + ((waktu % 24) * 0.5)}")
    } else {
            print("Boong Muluu Najiss")
    }
    }






  //  print("Total Jam Parkir:")

    //var inputJamParkir = readLine()!!.toInt()
    //println(
      //  inputJamParkir/24 * 15 + (
        //    if (inputJamParkir>= 24)0
        //else Math.min(inputJamParkir,5))+
          //      Math.max(inputJamParkir%24 - if (inputJamParkir > 24)0 else 5,0) * 0.5


// Ini salah semuaa ya



   // 1 -> println("$1")
    // 2 -> println("$2")
    // 3 -> println("$3")
    // 4 -> println("$4")
    // 5 -> println("$5")

//print("Hourse")

    //val harga1 = readLine()!!.toInt()
    // println(harga1/24 * 15 +(if (harga1 >= 24)
    // 0 else Math.min(harga1,5)) + Math.max(harga1%24 -
    // (if (harga1 > 24) 0 else 5),0) * 0,5)


