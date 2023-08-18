package Kotlinchallange

fun characterCountOccurence(inputstring: String, targetChar: Char) :Int {
    var count = 0
    for(char in inputstring){
        if ( char == targetChar){
            count++
        }
    }
    return count
}
fun main(args: Array<String>) {

    var datastringinput = "google"
    var mytargetChar = 'o'

    var charoccourence = characterCountOccurence(datastringinput, mytargetChar)
    println("$mytargetChar appears $charoccourence number of times ")
}