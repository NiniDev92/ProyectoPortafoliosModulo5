package com.example.proyectoportafoliosmodulo5.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.proyectoportafoliosmodulo5.model.Item

class MainViewModel : ViewModel() {

    private val _items = MutableLiveData<List<Item>>()
    val items: LiveData<List<Item>> get() = _items

    init {
        loadItems()
    }

    private fun loadItems() {
        _items.value = listOf(
            Item("Item 1", "Descripción 1"),
            Item("Item 2", "Descripción 2"),
            Item("Item 3", "Descripción 3")
        )
    }
}