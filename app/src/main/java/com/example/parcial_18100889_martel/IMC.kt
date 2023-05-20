package com.example.parcial_18100889_martel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class IMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        val valtxt1: EditText = findViewById(R.id.peso)
        val valtxt2: EditText = findViewById(R.id.estatura)

        val btnCal: Button = findViewById(R.id.btnCalcular)
        val btnBack2: Button = findViewById(R.id.btnBack2)

        btnCal.setOnClickListener {
            this.SendValue(Integer.parseInt(valtxt1.text.toString()),
                Integer.parseInt(valtxt2.text.toString()))


        }

        btnBack2.setOnClickListener {
            val intent = Intent(this,MenuActivity::class.java)
            startActivity(intent)


        }


    }
    private fun SendValue(val1:Int, val2:Int){
        val intent = Intent(this,ResultadoIMC::class.java)
        intent.putExtra("val1",val1)
        intent.putExtra("val2",val2)
        startActivity(intent)
    }
}