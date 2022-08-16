package com.anushka.viewmodeldemo_final1.sharedviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.anushka.viewmodeldemo_final1.R

class FragmentA : Fragment() {
   // private val sharedViewmodel : SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewmodel =ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        val edittext = view.findViewById<EditText>(R.id.edittext1)
        view.findViewById<Button>(R.id.button1).setOnClickListener {
            viewmodel.setCountry(edittext.text.toString())
            Navigation.findNavController(view).navigate(R.id.action_fragmentA_to_fragmentB)
        }
    }

}