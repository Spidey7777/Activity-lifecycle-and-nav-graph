package com.example.activityfragmentlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.activityfragmentlifecycle.databinding.ActivityMain3Binding


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main3)
        val binding = DataBindingUtil.setContentView<ActivityMain3Binding>(this, R.layout.activity_main3)

    }

    fun switchActivity2(view: View) {
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
}