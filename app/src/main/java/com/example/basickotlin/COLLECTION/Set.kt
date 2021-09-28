fun main() {
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)
    //buat nguurtin ,seberapa banyak angka pasti akan terurut juga

    val setC = setOf(1, 2, 4, 2, 1, 5)
    val setD = setOf(1, 5, 7)
    val union = setC.union(setD)
    val intersect = setC.intersect(setD)

    println(union)
    println(intersect)
    //mutable gunanya buat irisan atau

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2]   //tidak bisa mengubah set immutable
    mutableSet.add(6) //menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1

    println(mutableSet)
}