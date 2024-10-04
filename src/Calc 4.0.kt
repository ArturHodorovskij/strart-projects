fun main() {
    val z = calculateResult(inputFirstNumber(), inputSecondNumber(), inputOperation())
    print("Результат = $z")
}

fun inputFirstNumber(): Double {
    while (true) {
        print("Введите 1-ое число:")
        return readln().toDoubleOrNull() ?: continue
    }
}

fun inputSecondNumber(): Double {
    while (true) {
        print("Введите 2-ое число:")
        return readln().toDoubleOrNull() ?: continue
    }
}

fun inputOperation(): String {
    while (true) {
        print("Введите действие:")
        when (val operationInput = readlnOrNull()) {
            "+", "-", "/", "*" -> {
                return operationInput
            }
        }
    }
}

fun calculateResult(a: Double, b: Double, c: String): String {
    val result = when (c) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> {
            if (b != 0.0) {
                a / b
            } else {
                println("на 0 делить нельзя")
            }
        }
        else -> inputOperation()
    }
    return result.toString()
}

//хули она тут доебалась а в gpt не доебалась
