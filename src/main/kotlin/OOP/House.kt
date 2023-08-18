package OOP

class House(location:String,type:String,owner:String) {
    init {
        println("$location $type and is owned by $owner" )
    }

}

fun main(args: Array<String>) {
    var house1 = House(location = "Kiambu", type = "Bangalow", owner = "James")
    var house2 = House(location = "lavington", type = "highrise", owner = "kol")
    var house3 = House(location = "karen", type = "Bangalow", owner = "Mercy")
}
//a house with 3 properties; location, type,owner
//later change the order so that it sound better,..owner type location