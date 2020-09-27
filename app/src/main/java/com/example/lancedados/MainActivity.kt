package com.example.lancedados

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoJogar = findViewById<Button>(R.id.botaoJogar)
        val textoDado1 = findViewById<TextView>(R.id.dado1)
        val textoDado2 = findViewById<TextView>(R.id.dado2)

        botaoJogar.setOnClickListener {
            textoDado1.text = gerarNumero().toString()
            textoDado2.text = gerarNumero().toString()

            textoDado1.setTextColor(Color.parseColor("#FF0000"))
            textoDado2.setTextColor(Color.parseColor("#FF0000"))
        }
    }

    fun gerarNumero(): Int {
        return (1..6).random()
    }

}