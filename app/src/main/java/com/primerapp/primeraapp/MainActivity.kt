package com.primerapp.primeraapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // interface principal (Menú de pedido):
        //setContentView(R.layout.activity_main)

        // interface segunda (Resumen):
        //setContentView(R.layout.segunda_pantalla)

        // Tercera pantalla: Tarea 3
        setContentView(R.layout.tercera_pantalla)

        val lista = findViewById<android.widget.ListView>(
            R.id.listaOpciones
        )

        val videojuegos = listOf(
            Videojuego("God of War Ragnarök", R.drawable.godofwar),
            Videojuego("Grand Theft Auto V", R.drawable.gtav),
            Videojuego("Minecraft", R.drawable.minecraft),
            Videojuego(
                "The Legend of Zelda: Tears of the Kingdom",
                R.drawable.zelda
            ),
            Videojuego("Valheim", R.drawable.valheim),

        )

        val adaptador = VideojuegoAdapter(this, videojuegos)
        lista.adapter = adaptador

        lista.setOnItemClickListener { _, _, position, _ ->
            val seleccion = videojuegos[position].nombre

            android.widget.Toast.makeText(
                this,
                "Videojuego seleccionado: $seleccion",
                android.widget.Toast.LENGTH_SHORT
            ).show()
        }
    }
}