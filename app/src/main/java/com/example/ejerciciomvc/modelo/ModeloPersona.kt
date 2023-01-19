package com.example.ejerciciomvc.modelo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.ejerciciomvc.R

class ModeloPersona    {
    var nombre =  ""
    var dni = ""

    //UNA CLASE MODELO SIEMPRE TIENE UNA VARIABLE CONTEXTO
    //LATEINIT: SIGINIFICA QUE INICIALIZA MAS TARDE
    lateinit var context : Context

    //DEFINIMOS LA FUNCION RENDERIZAR. LLEVA LA PLANTILLA Al CONTROLADOR
    fun renderizar (context: Context): ViewGroup{
        //crea un tipo de servicio llamado inflater
        var inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        //infla la plantilla. Es decir, convierte el xml en una variable
        var viewGroup = inflater.inflate(R.layout.plantilla_1, null)
        var vista : ViewGroup = viewGroup as ViewGroup

        //asigna el nombre y el dni a la vist
        var titulo:TextView = viewGroup.findViewById(R.id.textView1)
        var subtitulo:TextView = viewGroup.findViewById(R.id.textView2)
        var button: Button = viewGroup.findViewById(R.id.button)
        titulo.setText(nombre)
        subtitulo.setText(dni)

        return viewGroup
    }

}