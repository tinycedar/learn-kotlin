package com.tinycedar.kotlin.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Created by daniel on 03/04/2017.
 */
fun main(args: Array<String>) = runBlocking {
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello, ")
}