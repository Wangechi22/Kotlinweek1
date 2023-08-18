package Kotlinchallange

fun main(args: Array<String>) {
    println("Type your names")
    var name:String = readln()!!.toString()

    if (name.isBlank()){
        println("Please enter a valid name")
    }
    else {
        print("Hello $name")
    }
}