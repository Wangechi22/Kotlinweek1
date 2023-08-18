package Kotlinchallange

fun main(args: Array<String>) {
    println("Input a number")
    var num1:Int = readln()!!.toInt()
    println("Input a number")
    var num2:Int = readln()!!.toInt()
    var result = num1 + num2
    println("The sum of $num1 and $num2 is $result")
}