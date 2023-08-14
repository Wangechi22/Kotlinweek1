fun main(args: Array<String>) {

    println("Input num1")
    var num1= readln()!!.toInt()
    println("Input num2")
    var num2= readln()!!.toInt()
    printadd(num1,num2)


}
fun sum(num1:Int, num2:Int):Int{
    return num1+num2
}
fun printadd(num1: Int, num2: Int){
    var add = sum(num1,num2)
    println("the sum is $add")
}