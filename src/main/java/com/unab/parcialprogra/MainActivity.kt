package com.unab.parcialprogra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clases()
    }

    fun clases(){
        val Alumno1 = Estudiante("Dennis", 21, arrayOf("JAVA", "PHP", "C++"))
        println(Alumno1.NOMBRE +" "+ Alumno1.EDAD)
        Alumno1.codigo()
    }

}
