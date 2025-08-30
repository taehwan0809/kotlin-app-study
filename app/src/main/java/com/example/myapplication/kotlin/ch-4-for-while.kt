package com.example.myapplication.kotlin

fun main(){
    var sum = 0
    for(i in 1.. 5){
        sum += i
    }
    println("합계: $sum")

    var count =3
    while(count >=0) {
        println("카운트 $count")
        count--
    }
}