package com.tinycedar.kotlin.coroutine

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * Created by daniel on 03/04/2017.
 */

fun main(args: Array<String>) = runBlocking {
    val job = launch(CommonPool) {
        doWorld()
    }
    println("Hello, ")
    job.join()
}

suspend fun doWorld() {
    delay(1000L)
    println("World!")
}