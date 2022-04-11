package com.example.ejemplocorrutinas1.app3suspension2runblocking

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){

    println("Tarea1 " + Thread.currentThread().name)

    runBlocking {
        delayCorrutina("Tarea 2") }

    println("Tarea3 " + Thread.currentThread().name)

    runBlocking {
        delayCorrutina("Tarea 4")
    }

    println("Tarea " + Thread.currentThread().priority)
}



suspend fun delayCorrutina(mensaje: String){
    println(mensaje + Thread.currentThread().name)
    delay(timeMillis = 10000)
}