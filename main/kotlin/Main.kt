fun main(){
    printNumbers()
    println( isEven(23))
    val y = 23
    println(y.isOdd())
    val dog = Dog()
    dog.bark()
    val cat = Cat()
    cat.meow()
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