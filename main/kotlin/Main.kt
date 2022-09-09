fun main(){
    // Immutable List
    val shoppingList = listOf<String>("toyota", "rolex", "mazda")
    println(shoppingList[1])

    // mutable List
    val shopping = mutableListOf("toyota", "rolex", "mazda")
    shopping.add("Ferrari")
    println(shopping[3])

    var counter = 0
    while (counter < shopping.size) {
        println(shopping[counter])
        counter++
    }
}
