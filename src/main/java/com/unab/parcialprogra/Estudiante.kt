package com.unab.parcialprogra

class Estudiante (val NOMBRE:String, val EDAD:Int, val LENGUAJES:Array<String>) {
    fun codigo(){
        for (LENG:String in LENGUAJES){
            println("CONOZCO ESTE LENGUAJE DE PROGRAMACION $LENG")
        }
    }
}