package com.example.srhr_client

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_personal_info.*

class PersonalInfoFragment : Fragment(R.layout.fragment_personal_info){



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       val listArray = resources.getStringArray(R.array.countries_array)
        val adapter = ArrayAdapter(requireContext(),R.layout.dropdown_item,listArray)
        countriesList.setAdapter(adapter)
        countriesList.setText("",false)
        textView7.setOnClickListener { findNavController().navigate(R.id.action_personalInfoFragment_to_lastScreen) }
    }
}