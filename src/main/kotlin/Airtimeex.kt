fun main(args: Array<String>) {

    //having already dailed *544#

    println("Enter number")
    var num = readln()!!.toInt()
    when(num){
        0 -> println("sh20=1GB FOR 1hr")
        1-> println("Data Deals")
        2-> println("Daily Bundles")
        3-> println("Weekly + FREE Youtube ")
        4-> println("GO MONTHLY ")
        else -> println("Invalid")

    }
    println("Choose a deal")
    var num1 = readln()!!.toInt()
    when(num1){
        0 -> println("sh100= 2GB 24HR + FREE Google Maps")
        1-> println("sh20=1GB 1hr")
        2-> println("sh50=1.5GB 3hr")
        3-> println("sh20=650MB 24hr")
        else -> println("Invalid")

    }


}