fun main(args: Array<String>) {
    println("Enter your age")
    var myage: Int = readln() !!.toInt()
    if (myage >=18) {
        print("Welcome to the club ")
    }
    else {
        print("We can't admit you")
    }

}