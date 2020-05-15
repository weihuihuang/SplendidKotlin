package com.example.kotlinlearning.classtest

class TestInetrfaceImpl : Person(), TestInterface{

    override fun doSomeThing() {
        println("TestInetrfaceImpl doSomeThing")
    }
}