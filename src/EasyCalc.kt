//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите первое число: ")
    val a = readln().toDouble()

    print("Введите второе число: ")
    val b = readln().toDouble()

    if (b.toInt() == 0) println("на ноль делить нельзя, не жми делить =D")

    print("Ведите действие:+ или - или * или /: ")
    val operation = readln()

    when (operation) {
        "+" -> print(a + b)
        "-" -> print(a - b)
        "*" -> print(a * b)
        "/" -> print(a / b)
        else -> print("Дэбил блеать")
    }
}




