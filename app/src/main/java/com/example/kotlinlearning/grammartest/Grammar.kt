package com.example.kotlinlearning.grammartest

import kotlin.math.max

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
        //变量自定类型，不自动推导
        var d : Int;
        d = 100;
        println("延迟赋值变量-->d : $d")
    }

    fun testMethodReturnMax_A(var1 : Int, var2 : Int) : Int{
        return max(var1,var2)
    }

    //下面两个都是语法糖，方法testMethodReturnMax_A的另外两种写法：当方法只有一行的的时候可以简写
    fun testMethodReturnMax_B(var1 : Int, var2 : Int) : Int = max(var1,var2)
    fun testMethodReturnMax_C(var1 : Int, var2 : Int) = max(var1,var2)

    fun testIfGrammer_A(var1 : Int, var2: Int) : Int{
        if(var1 > var2){
            return var1;
        }
        return var2;
    }
    fun testIfGrammer_B(var1 : Int, var2: Int) : Int{
        return if(var1 > var2){
            var1
        }else{
             var2
        }
    }
    fun testIfGrammer_C(var1 : Int, var2: Int) : Int = if(var1 > var2){ var1}else{ var2}
    fun testIfGrammer_D(var1 : Int, var2: Int)  = if(var1 > var2){ var1}else{ var2}
    fun testIfGrammer_E(var1 : Int, var2: Int)  = if(var1 > var2) var1 else var2

    fun  testGrammaerWhen_A(var1 : String) :String {
        var finalValue = when(var1){
            "splendid" -> "yes you are correct"
            "tom" ->"you are tom"
            //条件是String，传入int是不合法的
//            1 - >""
            "end" ->"demo method end"
            else ->"default"
        }
        return finalValue
    }

    fun  testGrammaerWhen_B(var1 : String) = when(var1){
        "splendid" -> "yes you are correct"
        "tom" ->"you are tom"
        "end" ->"demo method end"
        else ->"default"
    }

    fun  testGrammaerWhen_C(var1 : String) = testGrammaerWhen_B(var1)


    //is 关键字的使用，相当于instanceof
    fun testIsUse(varTest : Number) {
        when(varTest){
            is Int -> println("this is Int")
            is Double -> println("this is Double")
            is Float -> println("this is Float")
            else -> println("unknow type of number")
        }
    }

    fun testFor_A(){
        //闭区间[0,2]
        for(i in 0..2){
            println("for value_without_RangeDefault-->$i")
        }
        //闭区间[5,8]
        var range = 5..8;
        for(i in range){
            println("for value_with_RangeDefault-->$i")
        }
        //左开右闭[9,13)
        var range2 = 9 until 15;
        for(j in range2){
            println("for value_with_Range_2-->$j")
        }
        //最开始的for循环是每次递增1，step指的是递增数
        for(j in range2 step 4){
            println("for value_with_Range_tep-->$j")
        }

        //[10,8]
        for(k in 10 downTo  8){
            println("for value_with_Range_down-->$k")
        }
    }

}