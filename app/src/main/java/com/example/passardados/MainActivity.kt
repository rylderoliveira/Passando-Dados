package com.example.passardados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(applicationContext, DadosActivity::class.java)
            intent.putExtra("nome", "Rylder")
            intent.putExtra("idade", 25)
            startActivity(intent)
        }
    }
}