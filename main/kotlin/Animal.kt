abstract class Animal (
    val name: String,
    val legCount: Int = 4
    ){
    init {
        println("The Animal name is $name")
    }
}