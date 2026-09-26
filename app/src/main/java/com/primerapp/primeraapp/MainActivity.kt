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
        setContentView(R.layout.activity_main)

        // interface segunda (Resumen):
        //setContentView(R.layout.segunda_pantalla)
    }
}