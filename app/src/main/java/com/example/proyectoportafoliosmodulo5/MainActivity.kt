package com.example.proyectoportafoliosmodulo5

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectoportafoliosmodulo5.databinding.ActivityMainBinding
import com.example.proyectoportafoliosmodulo5.model.Item
import com.example.proyectoportafoliosmodulo5.viewmodel.MainViewModel
import com.example.proyectoportafoliosmodulo5.view.ItemAdapter
import com.example.proyectoportafoliosmodulo5.view.DetailActivity
import com.example.proyectoportafoliosmodulo5.view.FormActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    private lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ItemAdapter { item -> onItemClick(item) }
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
        binding.btnForm.setOnClickListener {
            startActivity(Intent(this, FormActivity::class.java))
        }

        viewModel.items.observe(this) { items ->
            adapter.submitList(items)
        }
    }

    private fun onItemClick(item: Item) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("title", item.title)
        intent.putExtra("description", item.description)
        startActivity(intent)
    }
}