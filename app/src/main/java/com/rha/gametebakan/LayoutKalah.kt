package com.rha.gametebakan

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class LayoutKalah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_layout_kalah)

        val yaBtn = findViewById<MaterialButton>(R.id.yesBtn)
        val tidakBtn = findViewById<MaterialButton>(R.id.tidakBtn)

        yaBtn.setOnClickListener {
            finish()
        }

        tidakBtn.setOnClickListener {
            finishAffinity()
        }
    }
}