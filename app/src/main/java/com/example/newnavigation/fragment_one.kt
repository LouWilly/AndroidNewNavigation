package com.example.newnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class FragmentOne : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.nav_fragment_one, container, false)

        view.findViewById<Button>(R.id.prev_button).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_fragmentOne_to_fragmentSix) }
        view.findViewById<Button>(R.id.next_button).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_fragmentOne_to_fragmentTwo) }

        return view
    }
}