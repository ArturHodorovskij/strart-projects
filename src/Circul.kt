fun main() {
    for (n in 0..12 step 3) {
        for (p in 12 downTo n) {
            print("+")
        }
        for (p in 1..n) {
            print("0")
        }
        for (p in 0..<n) {
            print("0")
        }
        for (p in n..12) {
            print("+")
        }
        println("")
    }
    for (n in 12 downTo 0 step 3) {
        for (p in 12 downTo n) {
            print("+")
        }
        for (p in 1..n) {
            print("0")
        }
        for (p in 0..<n) {
            print("0")
        }
        for (p in n..12) {
            print("+")
        }
        println("")
    }
}