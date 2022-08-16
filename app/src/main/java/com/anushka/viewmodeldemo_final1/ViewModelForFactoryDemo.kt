package com.anushka.viewmodeldemo_final1

import android.util.Log
import androidx.lifecycle.ViewModel

class ViewModelForFactoryDemo(name: String) : ViewModel() {
    var myname : String = name

    init {
        Log.d("viewmodel","$myname")
    }
}