package com.example.ejemplocorrutinas1.app1bloqueado

fun main(){

    println("Tarea1 " + Thread.currentThread().name)
    tareaLargaDuracion("Tarea2")
    println("Tarea3 " + Thread.currentThread().name)
    tareaCortaduracion("Tarea4")
    println("Tarea5" + Thread.currentThread().name)
    tareaLargaDuracion("Tarea6")
    println("Tarea7" + Thread.currentThread().name)
    tareaCortaduracion("Tarea8")
}

fun tareaLargaDuracion(mensaje:String){
    println(mensaje + Thread.currentThread().name)
    Thread.sleep(10000)
}

fun tareaCortaduracion(mensaje: String){
    println(mensaje + Thread.currentThread().name)
    Thread.sleep(1000)
}