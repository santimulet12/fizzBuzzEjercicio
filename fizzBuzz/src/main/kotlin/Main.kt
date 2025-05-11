package org.example

//FizzBuzz problem

fun entreTres(num:Int): Boolean{
    return num % 3 == 0
}

fun entreCinco(num: Int): Boolean{
    return num % 5 == 0
}

fun main(){

    for (n:Int in 0..100){
        if (entreTres(n)){
            if (entreCinco(n)){
                println("FizzBuzz")
            }
            else{
                println("Fizz")
            }
        }
        else{
            println(n)
        }
    }
}