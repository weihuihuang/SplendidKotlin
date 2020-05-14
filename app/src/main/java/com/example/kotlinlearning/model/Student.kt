package com.example.kotlinlearning.model

class Student: Person() {
    private var studentNum = 0;
    private var studentGrade =""

    fun setGrade(grade : String){
        this.studentGrade = grade;
    }

    //kotlin 方法默认是public和Java的public一样
    fun getGrade() = studentGrade
}