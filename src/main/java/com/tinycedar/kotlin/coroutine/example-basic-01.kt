package com.tinycedar.kotlin.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    launch {
        delay(1000L)
        println("world! " + Thread.currentThread().name)
    }
    println("Hello, " + Thread.currentThread().name)
    Thread.sleep(2000L)
}