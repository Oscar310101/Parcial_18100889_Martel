package com.example.parcial_18100889_martel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ResultadoIMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_imc)

        val valtv1 = intent.getIntExtra("val1",0)
        val valtv2 = intent.getIntExtra("val2",0)

        val Re = findViewById<TextView>(R.id.imcRe)

        val btnBack3: Button = findViewById(R.id.btnBack3)

        val Res= valtv1 + (valtv2 * valtv2)
        cate(Res)
        Re.text = Res.toString()




        btnBack3.setOnClickListener {
            val intent = Intent(this,IMC::class.java)
            startActivity(intent)


        }
    }
    private fun cate(val1:Int) {

        if(val1 <=18.5){
            Toast.makeText(this, "Pajo de Peso", Toast.LENGTH_SHORT).show()
        }else if(val1 >18.5 && val1 <=24.9){
            Toast.makeText(this, "PesoSaludable", Toast.LENGTH_SHORT).show()
        }else if(val1 >25 && val1 <=29.9) {
            Toast.makeText(this, "SobrePeso", Toast.LENGTH_SHORT).show()
        }else if(val1 >30){
                Toast.makeText(this, "Obesidad", Toast.LENGTH_SHORT).show()



            }
    }
}