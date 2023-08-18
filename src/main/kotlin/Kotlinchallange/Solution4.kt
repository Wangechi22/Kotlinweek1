package Kotlinchallange

fun main(args: Array<String>) {
    addingnums()


}

fun addingnums () {
    var nums = listOf( 0..100)
    var evennums = mutableListOf<Int>()

    for (x in 0..100) {
        if (x % 2 == 0) {
            evennums.add(x)
            println("$x")
        }
    }
}
