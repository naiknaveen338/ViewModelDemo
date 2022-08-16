package com.anushka.viewmodeldemo_final1.sharedviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private var _country = MutableLiveData<String>("Serbia")
        var country = _country

    fun setCountry(country : String) {
        _country.value = country
    }
}