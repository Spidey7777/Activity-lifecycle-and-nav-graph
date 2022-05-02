package com.example.activityfragmentlifecycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.activityfragmentlifecycle.databinding.Fragment2Binding

class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:Fragment2Binding = DataBindingUtil.inflate(inflater, R.layout.fragment_2, container, false)

        binding.nextButton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_fragment2_to_fragment3)
        }

        binding.button.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_fragment2_to_fragment1)
        }
        return binding.root
    }
}