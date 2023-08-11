fun main(args: Array<String>) {

    println("Enter the starting number of the range")
    var start = readln()!!.toInt()

    println("Enter the ending number of the range")
    var end = readln()!!.toInt()

    for (x in start..end) {
        if (x % 3 == 0) {
            println(" $x is Fizz")
        } else if (x % 5 == 0) {
            println("$x is Buzz")
        } else if (x % 3 == 0 && x % 5 == 0) {
            println("$x is FizzBuzz")
        } else {
            print('x')
        }
    }
}

