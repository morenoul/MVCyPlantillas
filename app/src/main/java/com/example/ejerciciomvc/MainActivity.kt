package com.example.ejerciciomvc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ejerciciomvc.modelo.ModeloPersona

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.plantilla_1)
        //Creamos una variable de la clase ModeloPersona
        var modeloPersona = ModeloPersona()
        //coge el nombre y el dni del modelo
        modeloPersona.nombre = "Juan"
        modeloPersona.dni = "12345678A"
        //crea el contexto
        modeloPersona.context = this
        //crea la vista contenida en el modelo
        var contenedor = modeloPersona.renderizar(modeloPersona.context)
        setContentView(contenedor)
    }
}