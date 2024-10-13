
fun main() {
    print("Введите длину пароля:")
    val passwodrlenght = readln().toInt()
    for (i in 1..passwodrlenght) {
        val values = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, "a", "b", "c", "d", "e", "f", "g").random().toString()
        print(values)
    }///
    
}