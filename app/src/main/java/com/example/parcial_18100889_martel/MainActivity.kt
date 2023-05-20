package com.example.parcial_18100889_martel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usua: EditText = findViewById(R.id.Usuario)
        val contra: EditText = findViewById(R.id.Password)

        val btnLogin: Button = findViewById(R.id.btnIngreso)

        btnLogin.setOnClickListener {
            val username = usua.text.toString()
            val password = contra.text.toString()

            if (validateCredentials(username, password)) {
                Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, MenuActivity::class.java))
            } else {
                Toast.makeText(this, "Correo o clave inválida", Toast.LENGTH_SHORT).show()
            }
        }


    }
    private fun validateCredentials(username: String, password: String): Boolean {
        return username == "admin@smartapp.com" && password == "admin123"
    }
}