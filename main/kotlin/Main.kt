fun main(){
    val x = 2+2
    if (x ==2) {
        println("x is 2")
    }else if (x == 4){
        println("x is 4")
    }
    else{
        println("x != 2")
    }
    val y = if (x==2) 2 else 3
    println(y)
}