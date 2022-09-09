fun main(){
    val number1 = readLine()
    val number2 = readLine()

    val result = number1!!.toInt() + number2!!.toInt()
    println(result)

    val number3 = readLine() ?: "0"
    val number4 = readLine() ?: "0"

    val result2 = number3.toInt() + number4.toInt()
    println(result2)
}