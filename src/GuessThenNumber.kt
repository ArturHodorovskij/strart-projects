import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 11)
    while (true) {
        val readNumber = writeNumber()
        if (randomNumber > readNumber) {
            println("введите число больше")
            continue
        }
        if (randomNumber < readNumber) {
            println("введите число меньше")
            continue
        }

        print("Красава, загаданное число $randomNumber, твое число $readNumber")
        break
    }
}
/////
  

fun writeNumber(): Int {
    while (true) {
        print("Введите число:  ")
        return readln().toIntOrNull() ?: continue
    }
}