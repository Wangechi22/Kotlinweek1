package Kotlinchallange

fun CharacterCountOccurence(inputstring:String, targetChar: Char): Int{
    var count = 0
    for(char in inputstring){
        if ( char == targetChar){
            count++
        }
    }
    return count
}
fun main(args: Array<String>) {

    println("Type in a string of words")
    var datastringinput = readln() ?:""  //this is so that if they use the space bar code won't crash
    println("Type in the letter you want to count")
    var mytargetChar = readln()?.get(0)?: ' '  //0 because it will start counting at the first letter

    var charoccourence = CharacterCountOccurence(datastringinput, mytargetChar)
    println("$mytargetChar appears $charoccourence number of times ")
}