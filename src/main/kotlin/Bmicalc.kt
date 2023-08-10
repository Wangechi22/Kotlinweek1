fun main(args: Array<String>) {

    println("In put your weight in kgs")
    var weight : Float = readln()!!.toFloat()
    println("In put your height in meters")
    var height : Float = readln()!!.toFloat()

    var BMI = weight/(height* height)

    print(BMI)
}