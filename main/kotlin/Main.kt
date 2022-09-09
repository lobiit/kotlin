fun main(){
    printNumbers()
    println( isEven(23))
    val y = 23
    println(y.isOdd())
}

fun isEven(number: Int):Boolean {
    return number % 2 == 0
}

fun Int.isOdd(): Boolean {
    return this % 2 == 1
}
fun printNumbers() {
    for (i in 1..10) {
        println(i)
    }
}