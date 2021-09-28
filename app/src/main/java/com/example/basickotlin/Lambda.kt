fun main() {
    message()
    printMessage("Hello Lamda With Transfer")
    val lenght = messageLenght("Hello From Lamda")
    println("lenght $lenght")
}

//bentuk function di ubah menjadi lambdad
val message = {println("Hellow Lambda")}

//lamda menggunakan parameter
val printMessage = {pesan :String -> println(pesan)}

val messageLenght = {message: String -> message.length}





