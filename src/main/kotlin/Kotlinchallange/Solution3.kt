package Kotlinchallange

fun main(args: Array<String>) {
   numchecker()
}



fun numchecker(){
    println("Input a number")
    var x: Int= readln()!!.toInt()
    if (x % 2 == 0 ){
        println("$x is an even number")
    }
    else{
        println("$x is an odd number")
    }
}