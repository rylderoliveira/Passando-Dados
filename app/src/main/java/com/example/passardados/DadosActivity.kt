package com.example.passardados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DadosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        val dados: Bundle? = intent.extras

        val nome: TextView = findViewById(R.id.text_nome)
        nome.text = dados?.getString("nome")

        val idade: TextView = findViewById(R.id.text_idade)
        idade.text = dados?.getInt("idade").toString()
    }
}