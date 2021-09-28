class Animal(val name : String, val age : Int){
    override fun toString(): String {
        return "DataAnimal(name=$name, age=$age)"
    }
}
data class DataAnimal(val name : String, val age: Int)

fun main() {
    val animal = Animal("Tiger", 4)
    val dataAnimal = DataAnimal("Elephant", 5)
    //equal()
    val dataAnimal2 = DataAnimal("Elephant", 5)
    val dataAnimal3 = DataAnimal("cow", 3)
    //copy()
    val dataAnimal4 = dataAnimal3.copy()

    println(animal)
    println(dataAnimal)

    println(dataAnimal.equals(dataAnimal2))
    println(dataAnimal.equals(dataAnimal3))

    println(dataAnimal4)

    // Componenttt nihhh

    val name = dataAnimal.component1()
    println("$name adalah component 1 dari variable dataAnimal")


}