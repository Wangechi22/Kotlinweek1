import java.util.Calendar

fun main(args: Array<String>) {
    //write a simple kotlin program
    //enter the year you were born
    //the code should tell you how old you are

    print("Enter the year you were born")

    var birthyear = readln()!!.toInt()
    var currentyear = Calendar.getInstance().get(Calendar.YEAR)
    var age = currentyear - birthyear
    println( "You are $age years old")

}