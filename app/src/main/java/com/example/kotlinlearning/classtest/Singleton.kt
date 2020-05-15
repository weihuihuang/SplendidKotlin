package com.example.kotlinlearning.classtest

/**
 * object 关键字声明单例类，自动保证全局只有一个单例
 */
object Singleton {

    //直接类名调用，类似于静态方法
    fun testSingleton(){
        println("hello, this is  a Singleton")
    }
}