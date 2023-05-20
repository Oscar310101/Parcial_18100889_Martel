package com.example.parcial_18100889_martel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.Date

class Signo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signo)
        val btnBack4: Button = findViewById(R.id.btnBack4)

        //val btnCon: Button = findViewById(R.id.btnConsultar)

        btnBack4.setOnClickListener {
            val intent = Intent(this,MenuActivity::class.java)
            startActivity(intent)


        }
       // btnCon.setOnClickListener {
            //this.signo()
       // }

    }
    private fun signo(val1:Date) {

        //if(val1 > 25-03 && val1 <=25-03){
            Toast.makeText(this, "Acuario", Toast.LENGTH_SHORT).show()
        //}else if(val1 >18.5 && val1 <=24.9){
            Toast.makeText(this, "Psicis", Toast.LENGTH_SHORT).show()
        //}else if(val1 >25 && val1 <=29.9) {
            Toast.makeText(this, "Aries", Toast.LENGTH_SHORT).show()
       // }else if(val1 >30){
            Toast.makeText(this, "Geminis", Toast.LENGTH_SHORT).show()
        //if(val1 > 25-03 && val1 <=25-03){
            Toast.makeText(this, "Geminis", Toast.LENGTH_SHORT).show()
        //}else if(val1 >18.5 && val1 <=24.9){
            Toast.makeText(this, "Cancer", Toast.LENGTH_SHORT).show()
        //}else if(val1 >25 && val1 <=29.9) {
            Toast.makeText(this, "Leo", Toast.LENGTH_SHORT).show()
        // }else if(val1 >30){
            Toast.makeText(this, "Libra", Toast.LENGTH_SHORT).show()
        //if(val1 > 25-03 && val1 <=25-03){
            Toast.makeText(this, "Escorpio", Toast.LENGTH_SHORT).show()
        //}else if(val1 >18.5 && val1 <=24.9){
            Toast.makeText(this, "Sagitario", Toast.LENGTH_SHORT).show()
        //}else if(val1 >25 && val1 <=29.9) {


        }


}