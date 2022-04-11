package com.example.ejemplocorrutinas1.app5launch


import kotlinx.coroutines.*

fun main(){

    println("Tarea1 " + Thread.currentThread().priority)

    GlobalScope.launch {
        delayCorrutina("Tarea2")
    }

    GlobalScope.launch {
        delayCorrutina("Tarea3")
    }

    GlobalScope.launch {
        delayCorrutina("Tarea4")
    }

    GlobalScope.launch {
        delayCorrutina("Tarea5")
    }

    GlobalScope.async {
        delayCorrutina2("Tarea6")
    }


    println("Tarea7 " + Thread.currentThread().name)

    Thread.sleep(20000)
}

suspend fun delayCorrutina(mensaje: String){
    delay(timeMillis = 10000)
    println(mensaje + Thread.currentThread().name)
}

suspend fun delayCorrutina2(mensaje: String){
    delay(15000)
    println(mensaje + Thread.currentThread().name)
}