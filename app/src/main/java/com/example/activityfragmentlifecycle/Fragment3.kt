package com.example.activityfragmentlifecycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.activityfragmentlifecycle.databinding.Fragment2Binding
import com.example.activityfragmentlifecycle.databinding.Fragment3Binding


class Fragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: Fragment3Binding = DataBindingUtil.inflate(inflater, R.layout.fragment_3, container, false)

        binding.button.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_fragment3_to_fragment2)
        }
        return binding.root
    }

}