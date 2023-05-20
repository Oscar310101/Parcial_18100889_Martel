package com.example.parcial_18100889_martel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnVolver: Button = findViewById(R.id.btnBack)
        val btnImc: Button = findViewById(R.id.btnImc)
        val btnSigno: Button = findViewById(R.id.btnZo)
        val btnGener: Button = findViewById(R.id.btnGe)

        btnVolver.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnImc.setOnClickListener {
            val intent = Intent(this,IMC::class.java)
            startActivity(intent)
        }
        btnSigno.setOnClickListener {
            val intent = Intent(this,Signo::class.java)
            startActivity(intent)
        }
        btnGener.setOnClickListener {
            val intent = Intent(this,Generaciones::class.java)
            startActivity(intent)
        }

    }
}