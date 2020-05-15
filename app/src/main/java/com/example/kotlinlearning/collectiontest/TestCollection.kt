package com.example.kotlinlearning.collectiontest

/**
 * kotlin 集合测试
 */
class TestCollection {

    fun runTestList(){
        val fruitList = listOf("Apple","Pear","Grape")
        var number = 0;
        for (i in fruitList){
            number++;
            println("fruit-->$number-->$i")
        }

        val  mutableList = mutableListOf("apple","bananer");
        mutableList.add("test fruit")
        for(j in mutableList){
           println("mutableList--->$j")
        }
        println("max length:" + mutableList.maxBy{it.length})

        var filterList = mutableList.filter { it.length >=5  }
        //map返回一个全新的list
        var mapList = filterList.map { it.toUpperCase() }
    }

    fun runTestSet(){
        var firstSet = setOf("number_1","number_2")
        for(i in firstSet){
            println("set test--->$i" )
        }

        var secondSet = mutableSetOf("number_1","number_2")
        for(i in secondSet){
            println("secondSet test--->$i" )
        }
        println("max length:" + secondSet.maxBy{it.length})
    }

    fun runTestMap(){
        var firstMap = mapOf<String,String>("fisrtKey" to "first","secondKey" to "second")
        println(firstMap.getValue("fisrtKey"))
        println(firstMap["secondKey"])

        var secondMap = HashMap<Int,String>()
        secondMap.put(1,"man")
        secondMap[2] = "woman"
        println(secondMap.entries)
        println(secondMap.keys)
        println(secondMap.values)
        for(f in secondMap.keys){
            println("遍历hashmap-->${secondMap[f]}")
        }
        for((key,value) in secondMap){
            println("遍历hashmap-->key:$key-->value:$value")
        }
        println("max length:" + secondMap.minBy{it.key})
        println("max length:" + secondMap.maxBy{it.value})
    }
}