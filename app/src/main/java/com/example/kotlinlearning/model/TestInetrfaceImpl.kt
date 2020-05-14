package com.example.kotlinlearning.model

class TestInetrfaceImpl : Person(), TestInterface{

    override fun doSomeThing() {
        println("TestInetrfaceImpl doSomeThing")
    }
}