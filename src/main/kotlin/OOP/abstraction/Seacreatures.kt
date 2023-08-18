package OOP.abstraction

abstract class Seacreatures (val name :String,){
    //abstract method
    abstract fun makesound()

    //general method
    fun describe(){
        print("$name is a sea creature")
    }
}
//subclass of a sea creature

class Fish(name: String): Seacreatures(name){//read as fish which inherits from sea creatures
    override fun makesound() {
        println(" named $name that makes a blup blup sound")
    }

}

class Whale(name: String): Seacreatures(name){
    //read as fish which inherits from sea creatures
    override fun makesound() {
         println(" named $name that makes a hmmm sound")
    }

}


fun main(args: Array<String>) {
    val creature1 : Seacreatures = Fish (name = "Nemo")
    val creature2 : Seacreatures = Whale (name = "Lilo")

    //this is accessing the data like how it should be displayed
    creature1.describe()
    creature1.makesound()

    creature2.describe()
    creature2.makesound()
}