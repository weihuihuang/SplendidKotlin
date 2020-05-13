package com.example.kotlinlearning.model

class Grammar {

    fun testVarAndVal(){
        var a = "MyFirstStringVar"
        var b = 10;
        //val类似与java的final只能赋值一次
        val c = "ppp"
        //两种写法
        println("String var:" + a)
        println("Int var:$b")
        println("Int var:$c")
    }
}