package com.example.ladm_u1_p2_archivosplanos_rojoamparo

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import androidx.core.view.get
import com.example.ladm_u1_p2_archivosplanos_rojoamparo.databinding.ActivityMain3Binding
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.ArrayList

class MainActivity3 : AppCompatActivity() {
    lateinit var binding : ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var lista = arrayOf("Ceviche de camarón",
            "Empanadas de camarón",
            "Ceviche de pescado",
            "Ensalada de pulpo",
            "Caldo de mariscos",
            "Orden de hostiones",
            "Pescado zarandeado",
            "Ensalada de mariscos",
            "Tostada de camarón",
            "Tostada de pescado")

        val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
        binding.listaOrd.adapter = adaptador

        binding.regresar.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }


        binding.listaOrd.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0->{
                    try {

                        var archivo = OutputStreamWriter(openFileOutput("datosRestaurant.txt", MODE_PRIVATE))

                        var cadena = lista[0]+"&&"

                        archivo.write(cadena)
                        archivo.flush()
                        archivo.close()

                        AlertDialog.Builder(this)
                            .setTitle("AVISO")
                            .setMessage("!Se ha realizado su pedido! En la sección pedidos encontrara los detalles")
                            .setPositiveButton("Aceptar"){d,i->}
                            .show()

                    }catch (e:Exception){

                        AlertDialog.Builder(this)
                            .setMessage(e.message)
                            .show()

                    }
                }
                1->{
                    try {

                        var archivo = OutputStreamWriter(openFileOutput("datosRestaurant.txt", MODE_PRIVATE))

                        var cadena = lista[1]+"&&"

                        archivo.write(cadena)
                        archivo.flush()
                        archivo.close()

                        AlertDialog.Builder(this)
                            .setTitle("AVISO")
                            .setMessage("!Se ha realizado su pedido! En la sección pedidos encontrara los detalles")
                            .setPositiveButton("Aceptar"){d,i->}
                            .show()

                    }catch (e:Exception){

                        AlertDialog.Builder(this)
                            .setMessage(e.message)
                            .show()

                    }
                }
                2->{
                    try {

                        var archivo = OutputStreamWriter(openFileOutput("datosRestaurant.txt", MODE_PRIVATE))

                        var cadena = lista[2]+"&&"

                        archivo.write(cadena)
                        archivo.flush()
                        archivo.close()

                        AlertDialog.Builder(this)
                            .setTitle("AVISO")
                            .setMessage("!Se ha realizado su pedido! En la sección pedidos encontrara los detalles")
                            .setPositiveButton("Aceptar"){d,i->}
                            .show()

                    }catch (e:Exception){

                        AlertDialog.Builder(this)
                            .setMessage(e.message)
                            .show()

                    }
                }
                3->{
                    try {

                        var archivo = OutputStreamWriter(openFileOutput("datosRestaurant.txt", MODE_PRIVATE))

                        var cadena = lista[3]+"&&"

                        archivo.write(cadena)
                        archivo.flush()
                        archivo.close()

                        AlertDialog.Builder(this)
                            .setTitle("AVISO")
                            .setMessage("!Se ha realizado su pedido! En la sección pedidos encontrara los detalles")
                            .setPositiveButton("Aceptar"){d,i->}
                            .show()

                    }catch (e:Exception){

                        AlertDialog.Builder(this)
                            .setMessage(e.message)
                            .show()

                    }
                }
                4->{
                    try {

                        var archivo = OutputStreamWriter(openFileOutput("datosRestaurant.txt", MODE_PRIVATE))

                        var cadena = lista[4]+"&&"

                        archivo.write(cadena)
                        archivo.flush()
                        archivo.close()

                        AlertDialog.Builder(this)
                            .setTitle("AVISO")
                            .setMessage("!Se ha realizado su pedido! En la sección pedidos encontrara los detalles")
                            .setPositiveButton("Aceptar"){d,i->}
                            .show()

                    }catch (e:Exception){

                        AlertDialog.Builder(this)
                            .setMessage(e.message)
                            .show()

                    }
                }
                5->{
                    try {

                        var archivo = OutputStreamWriter(openFileOutput("datosRestaurant.txt", MODE_PRIVATE))

                        var cadena = lista[5]+"&&"

                        archivo.write(cadena)
                        archivo.flush()
                        archivo.close()

                        AlertDialog.Builder(this)
                            .setTitle("AVISO")
                            .setMessage("!Se ha realizado su pedido! En la sección pedidos encontrara los detalles")
                            .setPositiveButton("Aceptar"){d,i->}
                            .show()

                    }catch (e:Exception){

                        AlertDialog.Builder(this)
                            .setMessage(e.message)
                            .show()

                    }
                }
                6->{
                    try {

                        var archivo = OutputStreamWriter(openFileOutput("datosRestaurant.txt", MODE_PRIVATE))

                        var cadena = lista[6]+"&&"

                        archivo.write(cadena)
                        archivo.flush()
                        archivo.close()

                        AlertDialog.Builder(this)
                            .setTitle("AVISO")
                            .setMessage("!Se ha realizado su pedido! En la sección pedidos encontrara los detalles")
                            .setPositiveButton("Aceptar"){d,i->}
                            .show()

                    }catch (e:Exception){

                        AlertDialog.Builder(this)
                            .setMessage(e.message)
                            .show()

                    }
                }
                7->{
                    try {

                        var archivo = OutputStreamWriter(openFileOutput("datosRestaurant.txt", MODE_PRIVATE))

                        var cadena = lista[7]+"&&"

                        archivo.write(cadena)
                        archivo.flush()
                        archivo.close()

                        AlertDialog.Builder(this)
                            .setTitle("AVISO")
                            .setMessage("!Se ha realizado su pedido! En la sección pedidos encontrara los detalles")
                            .setPositiveButton("Aceptar"){d,i->}
                            .show()

                    }catch (e:Exception){

                        AlertDialog.Builder(this)
                            .setMessage(e.message)
                            .show()

                    }
                }
                8->{
                    try {

                        var archivo = OutputStreamWriter(openFileOutput("datosRestaurant.txt", MODE_PRIVATE))

                        var cadena = lista[8]+"&&"

                        archivo.write(cadena)
                        archivo.flush()
                        archivo.close()

                        AlertDialog.Builder(this)
                            .setTitle("AVISO")
                            .setMessage("!Se ha realizado su pedido! En la sección pedidos encontrara los detalles")
                            .setPositiveButton("Aceptar"){d,i->}
                            .show()

                    }catch (e:Exception){

                        AlertDialog.Builder(this)
                            .setMessage(e.message)
                            .show()

                    }
                }
                9->{
                    try {

                        var archivo = OutputStreamWriter(openFileOutput("datosRestaurant.txt", MODE_PRIVATE))

                        var cadena = lista[9]+"&&"

                        archivo.write(cadena)
                        archivo.flush()
                        archivo.close()

                        AlertDialog.Builder(this)
                            .setTitle("AVISO")
                            .setMessage("!Se ha realizado su pedido! En la sección pedidos encontrara los detalles")
                            .setPositiveButton("Aceptar"){d,i->}
                            .show()

                    }catch (e:Exception){

                        AlertDialog.Builder(this)
                            .setMessage(e.message)
                            .show()

                    }
                }
            }
        }


    }


}