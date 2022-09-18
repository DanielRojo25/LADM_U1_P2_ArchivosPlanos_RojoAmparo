package com.example.ladm_u1_p2_archivosplanos_rojoamparo

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.collection.arrayMapOf
import com.example.ladm_u1_p2_archivosplanos_rojoamparo.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val lista = arrayListOf("$85 Ceviche de camarón",
            "$60 Empanadas de camarón",
            "$65 Ceviche de pescado",
            "$70 Ensalada de pulpo",
            "$90 Caldo de mariscos",
            "$100 Orden de hostiones",
            "$150 Pescado zarandeado",
            "$95 Ensalada de mariscos",
            "$80 Tostada de camarón",
            "$55 Tostada de pescado")

        val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
        binding.menu.adapter = adaptador



        binding.menu.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0->{
                    AlertDialog.Builder(this)
                        .setTitle("AVISO")
                        .setMessage("¿Qúe desea realizar?")
                        .setPositiveButton("ACTUALIZAR"){d,i->
                            lista[0]=binding.act.text.toString()
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                        }
                        .setNegativeButton("ELIMINAR"){d,i->
                            lista.removeAt(0)
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                            Toast.makeText(this,"Platillo eliminado",Toast.LENGTH_SHORT).show()
                        }
                        .setNeutralButton("SALIR"){d,i->}
                        .show()
                }
                1->{
                    AlertDialog.Builder(this)
                        .setTitle("AVISO")
                        .setMessage("¿Qúe desea realizar?")
                        .setPositiveButton("ACTUALIZAR"){d,i->
                            lista[1]=binding.act.text.toString()
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                        }
                        .setNegativeButton("ELIMINAR"){d,i->
                            lista.removeAt(1)
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                            Toast.makeText(this,"Platillo eliminado",Toast.LENGTH_SHORT).show()
                        }
                        .setNeutralButton("SALIR"){d,i->}
                        .show()

                }
                2->{
                    AlertDialog.Builder(this)
                        .setTitle("AVISO")
                        .setMessage("¿Qúe desea realizar?")
                        .setPositiveButton("ACTUALIZAR"){d,i->
                            lista[2]=binding.act.text.toString()
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                        }
                        .setNegativeButton("ELIMINAR"){d,i->
                            lista.removeAt(2)
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                            Toast.makeText(this,"Platillo eliminado",Toast.LENGTH_SHORT).show()
                        }
                        .setNeutralButton("SALIR"){d,i->}
                        .show()

                }
                3->{
                    AlertDialog.Builder(this)
                        .setTitle("AVISO")
                        .setMessage("¿Qúe desea realizar?")
                        .setPositiveButton("ACTUALIZAR"){d,i->
                            lista[3]=binding.act.text.toString()
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                        }
                        .setNegativeButton("ELIMINAR"){d,i->
                            lista.removeAt(3)
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                            Toast.makeText(this,"Platillo eliminado",Toast.LENGTH_SHORT).show()
                        }
                        .setNeutralButton("SALIR"){d,i->}
                        .show()

                }
                4->{
                    AlertDialog.Builder(this)
                        .setTitle("AVISO")
                        .setMessage("¿Qúe desea realizar?")
                        .setPositiveButton("ACTUALIZAR"){d,i->
                            lista[4]=binding.act.text.toString()
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                        }
                        .setNegativeButton("ELIMINAR"){d,i->
                            lista.removeAt(4)
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                            Toast.makeText(this,"Platillo eliminado",Toast.LENGTH_SHORT).show()
                        }
                        .setNeutralButton("SALIR"){d,i->}
                        .show()

                }
                5->{
                    AlertDialog.Builder(this)
                        .setTitle("AVISO")
                        .setMessage("¿Qúe desea realizar?")
                        .setPositiveButton("ACTUALIZAR"){d,i->
                            lista[5]=binding.act.text.toString()
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                        }
                        .setNegativeButton("ELIMINAR"){d,i->
                            lista.removeAt(5)
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                            Toast.makeText(this,"Platillo eliminado",Toast.LENGTH_SHORT).show()
                        }
                        .setNeutralButton("SALIR"){d,i->}
                        .show()

                }
                6->{
                    AlertDialog.Builder(this)
                        .setTitle("AVISO")
                        .setMessage("¿Qúe desea realizar?")
                        .setPositiveButton("ACTUALIZAR"){d,i->
                            lista[6]=binding.act.text.toString()
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                        }
                        .setNegativeButton("ELIMINAR"){d,i->
                            lista.removeAt(6)
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                            Toast.makeText(this,"Platillo eliminado",Toast.LENGTH_SHORT).show()
                        }
                        .setNeutralButton("SALIR"){d,i->}
                        .show()

                }
                7->{
                    AlertDialog.Builder(this)
                        .setTitle("AVISO")
                        .setMessage("¿Qúe desea realizar?")
                        .setPositiveButton("ACTUALIZAR"){d,i->
                            lista[7]=binding.act.text.toString()
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                        }
                        .setNegativeButton("ELIMINAR"){d,i->
                            lista.removeAt(7)
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                            Toast.makeText(this,"Platillo eliminado",Toast.LENGTH_SHORT).show()
                        }
                        .setNeutralButton("SALIR"){d,i->}
                        .show()

                }
                8->{
                    AlertDialog.Builder(this)
                        .setTitle("AVISO")
                        .setMessage("¿Qúe desea realizar?")
                        .setPositiveButton("ACTUALIZAR"){d,i->
                            lista[8]=binding.act.text.toString()
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                        }
                        .setNegativeButton("ELIMINAR"){d,i->
                            lista.removeAt(8)
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                            Toast.makeText(this,"Platillo eliminado",Toast.LENGTH_SHORT).show()
                        }
                        .setNeutralButton("SALIR"){d,i->}
                        .show()

                }
                9->{
                    AlertDialog.Builder(this)
                        .setTitle("AVISO")
                        .setMessage("¿Qúe desea realizar?")
                        .setPositiveButton("ACTUALIZAR"){d,i->
                            lista[9]=binding.act.text.toString()
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                        }
                        .setNegativeButton("ELIMINAR"){d,i->
                            lista.removeAt(9)
                            val adaptador = ArrayAdapter(this, R.layout.simple_list_item_1, lista)
                            binding.menu.adapter = adaptador
                            Toast.makeText(this,"Platillo eliminado",Toast.LENGTH_SHORT).show()
                        }
                        .setNeutralButton("SALIR"){d,i->}
                        .show()

                }
            }
        }

        binding.boton1.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))

        }
    }
}