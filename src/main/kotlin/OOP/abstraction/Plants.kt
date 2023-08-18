package OOP.abstraction

abstract class Plants(var name: String){

    abstract fun smell()

    fun describe (){
        println("$name is a plant")
    }

}

class Flower(name: String):Plants(name){
    override fun smell() {
        println("$name smells like vanilla")
    }

}

class Weeds(name: String):Plants(name){
    override fun smell() {
        println("$name smells like poop")
    }

}

fun main(args: Array<String>) {
    var plant1: Plants = Flower (name = "Tulip")
    var plant2: Plants = Weeds(name = "Mexican Merigold")

    plant1.describe()
    plant1.smell()


    plant2.describe()
    plant2.smell()
}