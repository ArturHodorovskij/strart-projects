import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Введите первое число (или 'exit' для выхода):")
        val firstInput = scanner.nextLine()

        if (firstInput.lowercase() == "exit") {
            println("Выход из программы.")
            break
        }

        val firstNumber = firstInput.toDoubleOrNull()
        if (firstNumber == null) {
            println("Некорректный ввод. Попробуйте снова.")
            continue
        }

        println("Введите оператор (+, -, *, /):")
        val operator = scanner.nextLine()

        println("Введите второе число:")
        val secondInput = scanner.nextLine()
        val secondNumber = secondInput.toDoubleOrNull()

        if (secondNumber == null) {
            println("Некорректный ввод. Попробуйте снова.")
            continue
        }

        val result = when (operator) {
            "+" -> firstNumber + secondNumber
            "-" -> firstNumber - secondNumber
            "*" -> firstNumber * secondNumber
            "/" -> {
                if (secondNumber != 0.0) {
                    firstNumber / secondNumber
                } else {
                    println("Ошибка: Деление на ноль!")
                    continue
                }
            }
            else -> {
                println("Неверный оператор!")
                continue
            }
        }

        println("Результат: $result")
    }
}