fun main(args: Array<String>) {

    for (x in 1..100){
        if (x % 3 == 0){
            println(" $x is Fizz")
        }
       else if (x % 5 == 0){
            println("$x is Buzz")
       }
       else if (x % 3 == 0 && x % 5 ==0){
           println("$x is FizzBuzz")
       }
       else {
           print('x')
       }
    }
}
//fizz buzz question
//using for loop and range of numbers 1-100
//numbers divisible by 3 and 5 print FizzBuzz
//numbers divisible by 3 Fizz
//numbers divisible by 5 Buzz

