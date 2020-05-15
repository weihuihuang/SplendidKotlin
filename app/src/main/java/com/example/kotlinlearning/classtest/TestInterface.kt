package com.example.kotlinlearning.classtest

interface TestInterface {

    fun doSomeThing();

    // 默认实现之后子类可以选择实现或者不实现
    fun someThingDefault(){
        println("TestInterface someThingDefault")
    }
}