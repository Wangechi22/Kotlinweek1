package OOP.encapsulation

//offering protection of data to outside world
//use PRIVATE meaning it can only be accessed in this class only
class People (private var name:String,private var age: Int) {
    fun getPersoninfro (): String{
        return "Name:$name, Age:$age"
    }

}

fun main(args: Array<String>) {
    var person1 = People(name = "Bazu", age = 25)

    println(person1.getPersoninfro())
}