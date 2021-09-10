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

    private fun sentenciaIf(){}
    private fun bucle(){}
}
