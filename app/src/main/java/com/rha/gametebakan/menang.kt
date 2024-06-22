package com.rha.gametebakan

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class menang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menang)

        val yaBtn = findViewById<MaterialButton>(R.id.yesBtn)
        val tidakBtn = findViewById<MaterialButton>(R.id.tidakBtn)

        yaBtn.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
            )
        }

        tidakBtn.setOnClickListener {
            finishAffinity()
        }

    }
}