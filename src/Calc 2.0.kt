fun main() {
    val first = firstNumber()
    val operation = operation()
    val second = secondNumber()

    when (operation) {
        "+" -> print(first + second)
        "-" -> print(first - second)
        "*" -> print(first * second)
        "/" -> print(first / second)
    }
}

fun firstNumber(): Double {
    print("Введите первое число: ")
    return readln().toDouble()
}

fun operation(): String {
    print("Введите действие: ")
    return readln()
}

fun secondNumber(): Double {
    print("Введите второе число: ")
    return readln().toDouble()
}
//fun String.safeCast():Double{

//}


