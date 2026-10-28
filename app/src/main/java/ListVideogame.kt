package com.primerapp.primeraapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

data class Videojuego(
    val nombre: String,
    val imagen: Int
)

class VideojuegoAdapter(
    context: Context,
    private val videojuegos: List<Videojuego>
) : ArrayAdapter<Videojuego>(
    context,
    0,
    videojuegos
) {

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {

        val vista = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.filas_videojuegos, parent, false)

        val imagen = vista.findViewById<ImageView>(
            R.id.imagenJuego
        )

        val nombre = vista.findViewById<TextView>(
            R.id.nombreJuego
        )

        val videojuego = videojuegos[position]

        imagen.setImageResource(videojuego.imagen)
        nombre.text = videojuego.nombre

        return vista
    }
}
