package com.example.activityfragmentlifecycle

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentContainer
import androidx.navigation.Navigation
import com.example.activityfragmentlifecycle.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    private var score = 0
    private lateinit var score_text : TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        val binding = Fragment1Binding.inflate(inflater, container, false)
        val binding: Fragment1Binding = DataBindingUtil.inflate(inflater, R.layout.fragment_1, container, false)

        binding.nextButton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(Fragment1Directions.actionFragment1ToFragment2(score))
        }

        binding.button.setOnClickListener { view: View ->
            val intent = Intent(activity, MainActivity2::class.java)
            startActivity(intent)
        }

        binding.addButton2.setOnClickListener { view: View ->
            score++
            binding.scoreValue.text = score.toString()
        }
        return binding.root
    }
}