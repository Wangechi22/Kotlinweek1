package OOP

class Car(make:String,model:String,price:Int) {
    init {
        //one needs to initialize so as to pass the components
        println("$make $model that costs $price")


    }
}

fun main(args: Array<String>) {

    var owner1 = Car(model ="Toyota", make = "Vitz", price = 800000 )
    var owner2 = Car(model ="Merceedes", make = "Gle 63S", price = 20000000 )
    var owner3 = Car(model ="BMW", make = "x6", price = 7000000 )
}