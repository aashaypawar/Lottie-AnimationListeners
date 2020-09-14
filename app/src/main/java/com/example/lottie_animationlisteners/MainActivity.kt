package com.example.lottie_animationlisteners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn = findViewById<Button>(R.id.btnStart)
        val stopBtn = findViewById<Button>(R.id.btnStop)

        startBtn.setOnClickListener {
            animationView.playAnimation()
        }

        stopBtn.setOnClickListener {
            animationView.pauseAnimation()
        }
    }

}