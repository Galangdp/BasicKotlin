fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')
    val anyList = listOf('a', "Kotlin", 3, true)


    println(anyList)
    println(anyList[3])
    //untuk mengambil list ketiga dalam list


    val mutabbleList = mutableListOf('a', "Kotlin", 3, true)
    mutabbleList.add('d') //menambah item di akhir list
    println(mutabbleList)

    mutabbleList.add(1, "my") //menambah item dengan indeks ke-1
    println(mutabbleList)

    mutabbleList[3] = false //mengubah nilai pada indeks ke-3
    println(mutabbleList)

    mutabbleList.removeAt(1) //menghapus item user() berdasarkan index atau posisi nilai di dalam array
    println(mutabbleList)


}