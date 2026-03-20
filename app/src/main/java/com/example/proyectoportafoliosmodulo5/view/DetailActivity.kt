package com.example.proyectoportafoliosmodulo5.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectoportafoliosmodulo5.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Recibir datos desde MainActivity
        val title = intent.getStringExtra("title")
        val description = intent.getStringExtra("description")

        // Mostrar datos en pantalla
        binding.tvTitle.text = title
        binding.tvDescription.text = description
    }
}