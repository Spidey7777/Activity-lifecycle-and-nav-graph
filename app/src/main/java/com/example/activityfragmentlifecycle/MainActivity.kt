package com.example.activityfragmentlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import timber.log.Timber

const val KEY_SCORE = "key_score"

class MainActivity : AppCompatActivity() {

    private var score = 0
    private lateinit var score_text : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("onCreate called")
        setContentView(R.layout.activity_main)
        score_text = findViewById(R.id.score_text)

        if (savedInstanceState != null) {
            score = savedInstanceState.getInt(KEY_SCORE)
        }
        score_text.text = score.toString()
    }

    fun switchActivity2(view: View) {
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

    fun add(view: View) {
//        var num = score_text.text.toString().toInt()
//        num++
//        score_text.text = num.toString()
        score++
        score_text.text = score.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_SCORE, score)
    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart Called")
    }
}
