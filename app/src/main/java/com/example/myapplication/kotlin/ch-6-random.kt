package com.example.myapplication.kotlin

import kotlin.random.Random

fun main(){
    /*val randomNumber = Random.nextInt(1,11)
    println("행운의 숫자 $randomNumber")

    val fruits = listOf("사과", "바나나", "포도", "딸기")
    val randomFruit = fruits.random()
    println("랜덤 과일 $randomFruit")
    */

    val number = Random.nextInt(1,7)
    println("주사위 결과: $number")

    val name = listOf("철수","영희","민수")
    val rn = name.random()
    println("당번은 $rn")
}
