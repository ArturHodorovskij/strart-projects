fun main() {
    while (true) {
        println("1 - Конвертер валют")
        println("2 - Конвертер температуры")
        println("3 - Конвертер расстояние")
        print("Выберите необходимый конвертер: ")
        when (readln()) {
            "1" -> convertMoney()
            "2" -> convertTemp()
            "3" -> convertSpacing()
            else -> {
                println("Неверное значение, попробуйсте снова")
                continue
            }
        }
        break
    }
}

fun convertMoney() {
    while (true) {
        print("Введите сумму BLR: ")
        val readBlr = readln().toDoubleOrNull() ?: continue
        println("1 - Конвертер валют USD")
        println("2 - Конвертер валют EUR")
        println("3 - Конвертер валют PLN")
        println("4 - Конвертер валют RUB")
        print("Выберите необходимую валюту: ")
        when (readln()) {
            "1" -> println("Доллары:${readBlr / 3.25} USD")
            "2" -> println("Евро:${readBlr / 3.59} EUR")
            "3" -> println("Злотые:${readBlr / 0.83} PLN")
            "4" -> println("Российский рубль:${readBlr / 0.0345} RUB")
            else -> {
                println("Неверное значение, попробуйсте снова")
                continue
            }
        }
        break
    }
}

fun convertTemp() {
    while (true) {
        print("Введите температуру в градусах цельсия: ")
        val readTemp = readln().toDoubleOrNull() ?: continue
        val fahrenheit = readTemp * 1.8 + 32
        val kelvin = readTemp + 273.15
        println("Температура в фарингейтах: $fahrenheit")
        println("Температура в кельвинах: $kelvin")
        break
    }
}

fun convertSpacing() {
    while (true) {
        print("Введи расстояние в киломметрах: ")
        val readDistance = readln().toDoubleOrNull() ?: continue
        val millage = readDistance * 0.62
        val feet = readDistance * 3280.84
        println("Расстояние в милях: $millage")
        println("Расстояние в футах: $feet")
        break
    }
}