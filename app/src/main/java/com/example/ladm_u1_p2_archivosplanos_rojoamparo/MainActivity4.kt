package com.example.ladm_u1_p2_archivosplanos_rojoamparo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.ladm_u1_p2_archivosplanos_rojoamparo.databinding.ActivityMain4Binding
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regresar.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

        try {

            var archivo = BufferedReader(InputStreamReader(openFileInput("datosRestaurant.txt")))

            var cadena = archivo.readLine()

            cadena = cadena.replace("&&","\n")

            val texto = "Su orden fue " +cadena

            binding.pedido.setText(texto)

        }catch (e: java.lang.Exception){

            AlertDialog.Builder(this)
                .setMessage(e.message)
                .show()

        }


    }


}