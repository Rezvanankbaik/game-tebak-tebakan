package com.rha.gametebakan

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_menu)

        val playBtn = findViewById<MaterialButton>(R.id.playBtn)
        val quitBtn = findViewById<MaterialButton>(R.id.quitBtn)

        playBtn.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
            )
        }

        quitBtn.setOnClickListener {
            finishAffinity()
        }
    }
}