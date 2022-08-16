package com.anushka.viewmodeldemo_final1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ViewModelFactory(private var name: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ViewModelForFactoryDemo::class.java)) {
            return ViewModelForFactoryDemo(name) as T
        }
        throw IllegalArgumentException("Viewmodel not found")
    }
}