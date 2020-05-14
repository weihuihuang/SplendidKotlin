package com.example.kotlinlearning.model


fun main() {
    var  p = Person();
    p.age = 18;
    p.name = "PersonName";
    println("age-->" + p.age + "     name-->" + p.name)

    var student = Student()
    student.age = 18;
    student.setGrade("first grade")
    println("student age-->" + student.age + "     student grade-->" + student.getGrade())

    var teacher = Teacher("testTeacherName")

    //接口实现
    TestInetrfaceImpl().doSomeThing()
    TestInetrfaceImpl().someThingDefault()

    var data1 = KeywordData("data1")
    var data2 = KeywordData("data2")
    var data3 = KeywordData("data1")
    println("data1 compare data2 :" + (data1 == data2))
    //去掉data关键字 data1和data3将会不相等
    println("data1 compare data3 :" + (data1 == data3))
    //单例测试
    Singleton.testSingleton()

}