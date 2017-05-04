package com.tinycedar.kotlin.coroutine

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch


fun main(args: Array<String>) {
    launch(CommonPool) {
        delay(1000L)
        println("world! " + Thread.currentThread().name)
    }
    println("Hello, " + Thread.currentThread().name)
    Thread.sleep(2000L)
}