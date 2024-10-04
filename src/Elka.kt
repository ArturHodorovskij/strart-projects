fun main() {
    for (i in 0..3) {
        for (j in 20 downTo i) {
            print(" ")
        }
        for (j in 0..i) {
            print("+")
        }
        for (j in 0..<i) {
            print("+")
        }
        for (j in 20 downTo i) {
            print(" ")
        }
        println("")
    }
    for (i in 0..5) {
        for (j in 20 downTo i) {
            print(" ")
        }
        for (j in 0..i) {
            print("+")
        }
        for (j in 0..<i) {
            print("+")
        }
        for (j in 20 downTo i) {
            print(" ")
        }
        println("")
    }

    for (i in 0..8) {
        for (j in 20 downTo i) {
            print(" ")
        }
        for (j in 0..i) {
            print("+")
        }
        for (j in 0..<i) {
            print("+")
        }
        for (j in 20 downTo i) {
            print(" ")
        }
        println("")
    }
    for (i in 0..3) {
        for (j in 19 downTo 0) {
            print(" ")
        }
        for (j in 0..2) {
            print("+")
        }
        for (j in 19 downTo 0) {
            print(" ")
        }
        println("")
    }
}