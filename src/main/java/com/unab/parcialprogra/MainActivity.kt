package com.unab.parcialprogra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun sentenciaWhen(){
        val pais = "El Salvador"
        when (pais) {
            "El Salvador" -> {
                println("Pupusas")
            }
            "Mexico" -> {
                println("Tacos")
            }
            "Guatemana" -> {
                println("Kak ik")
            }
            "Argentina" -> {
                println("Choris")
            }
            "Brasil" -> {
                println("Churrazco")
            }

            else -> {
                println("No se conoce")
            }
        }
    }

    private fun sentenciaIf(){
        val color = "Rojo"

        if(color == "rojo" ){
            println("El color es rojo")
        }
        else if(color == "verde" ){
            println("No se ha identificado el color")
        }
        else{
            println("No se ha identificado el color")
        }

    }
    private fun bucle(){
        val bucle = listOf("Dennis", "Gilberto", "Fuentes", "Landaverde")
        for(mibucle in bucle){
            println(mibucle)
        }
        for(x in 1..1){
            println(x)
        }
        for(x in 2..2){
            println(x)
        }
        for(x in 1 downTo 1){
            println(x)
        }
        for(x in 3 downTo 3){
            println(x)
        }

    }
}
