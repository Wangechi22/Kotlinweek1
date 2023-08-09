fun main(args: Array<String>) {

    // 0-39 E
    // 40-49 D
    // 50-59 C
    // 60-69 B
   // 70-100 A


    print("Enter your marks")
    var x: Int = readln()!!.toInt()

    if ( x in 0..39) {
        print("E")
    }
    else if (x in 40..49) {
        print("D")
    }
    else if (x in 50..59) {
        print("C")
    }
    else if (x in 60..69){
        print("B")
    }
    else if (x in 70..100 ) {
        print("A")
    }
    else  {
        print("Not applicable")
    }

}

