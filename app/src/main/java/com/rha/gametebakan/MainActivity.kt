package com.rha.gametebakan

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn_option_1 = findViewById<MaterialButton>(R.id.btn_option_1)
        val btn_option_2 = findViewById<MaterialButton>(R.id.btn_option_2)
        val btn_option_3 = findViewById<MaterialButton>(R.id.btn_option_3)

        btn_option_1.setOnClickListener {
            startActivity(
                Intent(this, MainActivity2::class.java)

            )
            Toast.makeText(this, "Ya, anda benar🥳", Toast.LENGTH_SHORT).show()
        }

        btn_option_2.setOnClickListener {
            startActivity(
                Intent(this, LayoutKalah::class.java)
            )
            Toast.makeText(this, "Yah anda kalah😭", Toast.LENGTH_SHORT).show()
        }

        btn_option_3.setOnClickListener {
            startActivity(
                Intent(this, LayoutKalah::class.java)
            )
            Toast.makeText(this, "Yah anda kalah😭", Toast.LENGTH_SHORT).show()

        }
    }
}