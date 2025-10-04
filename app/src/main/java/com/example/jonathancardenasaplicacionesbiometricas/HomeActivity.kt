package com.example.jonathancardenasaplicacionesbiometricas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jonathancardenasaplicacionesbiometricas.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvWelcome.text = "Bienvenido a la app"


    }
}
