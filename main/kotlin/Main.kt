fun main(){
    // mutable List
    val shopping = mutableListOf("toyota", "rolex", "mazda")
    shopping.add("Ferrari")

    val x = 3
    when(x) {
        in 1..2 -> println("x is between 1 and 2")
        in 3..10 -> println("x is between 3 and 10")
        else -> {
            println("x is not in the range of 1 to 10")
        }
    }
}
