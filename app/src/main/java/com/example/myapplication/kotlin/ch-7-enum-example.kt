package com.example.myapplication.kotlin

enum class Fruits{
    BANANA, APPLE
}
enum class Transport{
    BUS, CAR, BIKE
}

fun main(){
    val myWay: Transport = Transport.BUS
    println("오늘은 ${myWay}를 탔다")
    val myWay2 = "BUS"
    println("오늘은 ${myWay2}를 탔다")

    when(myWay) {
        Transport.BUS -> {println("myWay bus") }
        Transport.CAR -> {println("myWay car") }
        Transport.BIKE -> {println("myWay bike") }
    }
    when(myWay2) {
        "bus" -> {println("myWay2 bus") }
        "car" -> {println("myWay2 car") }
        "bike" -> {println("myWay2 bike") }
    }

}


