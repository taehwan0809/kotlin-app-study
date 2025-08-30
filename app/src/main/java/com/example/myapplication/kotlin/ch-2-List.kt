package com.example.myapplication.kotlin

fun main(){
    //여러 값을 한 번에 보관하는 자료구조
    //val fruits = listOf("사과", "바나나", "포도") // 불변 리스트: 값 추가, 삭제 불가능
    //println(fruits)

    //val animals = mutableListOf("강아지", "고양이") // 가변 리스트: 값 추가, 삭제 가능
    //println(animals)

    //animals.remove("강아지")
    //println(animals)

    //animals.add("토끼")
    //println(animals)

    val fruits2 = mutableListOf("사과", "바나나")
    fruits2.add("딸기")
    println("추가 후: $fruits2")
    fruits2.remove("바나나")
    println("제거 후: $fruits2")



}