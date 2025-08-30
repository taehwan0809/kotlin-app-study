package com.example.myapplication.kotlin

fun main() {
/*
    val box = 3

    if(box == 3) {
        println("3개 입니다")
    }else if (box > 2) {
        println("2개보다 많음")
    }
    else{
        println("2개보다 적습니다")
    }

    val score = 85
    when(score){
        in 90.. 100 -> println("A 학점")
        in 80.. 89 -> println("B 학점")
        else -> println("C 학점")
    }

    when{
        score == 90 -> println("A 학점")
        score == 85 -> println("B 학점")
        score == 60 -> println("C 학점")
        score == 50 -> println("D 학점")
    }
*/

    val score = 85
    val day = 3

    if (score >=90)
        println("A 학점")
    else if (score >= 80)
        println("B 학점")
    else
        println("C 학점")

    when{
        day == 1 -> println("월요일")
        day == 2 -> println("화요일")
        day == 3 -> println("수요일")
        day == 4 -> println("목요일")
        day == 5 -> println("금요일")
        day == 6 -> println("토요일")
        day == 7 -> println("일요일")

    }


}