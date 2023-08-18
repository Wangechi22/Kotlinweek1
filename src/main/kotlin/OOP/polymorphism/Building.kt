package OOP.polymorphism

//taking many states or different forms
//super class

open class Building (val type: String){
    open fun opendoor(){
        println("$type door is opening")
    }
}
//sub class

class House(type: String): Building(type){
    override fun opendoor() {
        println("$type house door is opening")
    }
}

class Apartment(type: String):Building(type){
    override fun opendoor() {
        println("$type apartment door is opening")
    }
}

class OffoceBlock(type: String):Building(type){
    override fun opendoor() {
        println("$type office door is opening")
    }
}

fun main(args: Array<String>) {
    var building1:Building = House(type = "Bangalow") //House object is been treated like a building
    building1.opendoor() //calls the overriden method in house

    var building2:Building = Apartment(type = "Studio") //Apartment object is been treated like a building
    building2.opendoor() //calls the overriden method in Apartment


    var building3:Building = OffoceBlock(type = "CW") //Officeblock object is been treated like a building
    building3.opendoor() //calls the overriden method in Officeblock


}