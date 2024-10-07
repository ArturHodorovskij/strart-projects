fun main() {
    while (true) {
        println("a - Конвертер валют")
        println("b - Конвертер температуры")
        println("c - Конвертер расстояние")
        print("Выберите необходимый конвертер: ")

        when (readln()) {
            "a" -> converterCurrency()
            "b" -> converterTemperature()
            "c" -> convertDistance()

            else -> {
                println("Неверное значение, попробуйсте снова")
                continue
            }
        }
        break
    }

}

fun converterCurrency() {
    while (true) {
        print("Введите сумму BLR: ")
        val readBlr = readln().toDoubleOrNull() ?: continue
        val usd = readBlr / 3.25
        val eur = readBlr / 3.59
        val pln = readBlr / 0.83
        val rub = readBlr / 0.0345

        println("Курс доллара: $usd")
        println("Курс евро: $eur")
        println("Курс злотого: $pln")
        println("Курс российского рубля: $rub")
        break

    }

}

fun converterTemperature() {
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

fun convertDistance() {
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