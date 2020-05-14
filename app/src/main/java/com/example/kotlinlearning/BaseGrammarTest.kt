package com.example.kotlinlearning

import com.example.kotlinlearning.model.Grammar

/**
 * kotlin 基础语法demo，包括变量命名，if条件，for循环等
 */
fun main() {
    var grammar = Grammar()

    grammar.testVarAndVal()

    println("max_A:" + grammar.testMethodReturnMax_A(900,10))
    println("max_B:" + grammar.testMethodReturnMax_B(200,400))
    println("max_C:" + grammar.testMethodReturnMax_B(600,400))

    println("testIf_A:" + grammar.testIfGrammer_A(600,400))
    println("testIf_B:" + grammar.testIfGrammer_B(600,400))
    println("testIf_C:" + grammar.testIfGrammer_C(600,400))
    println("testIf_D:" + grammar.testIfGrammer_D(600,400))
    println("testIf_E:" + grammar.testIfGrammer_E(600,400))

    println("test_When_A:" + grammar.testGrammaerWhen_A("end"))
    println("test_When_B:" + grammar.testGrammaerWhen_B("splendid"))
    println("test_When_C:" + grammar.testGrammaerWhen_C(""))

    grammar.testIsUse(100)
    grammar.testIsUse(0.0f)
    grammar.testIsUse(0.0)
    grammar.testIsUse(0L)

    grammar.testFor_A()
}