package com.example.proyectoportafoliosmodulo5.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.proyectoportafoliosmodulo5.databinding.ActivityFormBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class FormActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {
            sendForm()
        }
    }

    private fun sendForm() {
        val name = binding.etName.text.toString()
        val email = binding.etEmail.text.toString()

        lifecycleScope.launch {
            Toast.makeText(this@FormActivity, "Enviando...", Toast.LENGTH_SHORT).show()

            delay(2000) // ⏳ Simula proceso en segundo plano

            Toast.makeText(
                this@FormActivity,
                "Formulario enviado: $name",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}