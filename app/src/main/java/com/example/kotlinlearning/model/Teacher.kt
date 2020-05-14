package com.example.kotlinlearning.model

class Teacher(teacherName: String) : Person(){
    init {
        //这个函数可以写一下主构造函数的一写逻辑，比如可以给teacherName重新赋值
        println("teacherName -->$teacherName")
    }
}