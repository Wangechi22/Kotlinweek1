fun main(args: Array<String>) {
    printSum(120,500)

}
fun sumNumbers(num1:Int, num2:Int) :Int{
    return num1 + num2
}
fun printSum(num1: Int, num2: Int){
    var sum = sumNumbers(num1,num2)
    print(sum)
}