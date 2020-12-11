package com.example.entregaviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.entregaviews.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //binding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botoncito.setOnClickListener{
            Toast.makeText(this@MainActivity, botoncito.text, Toast.LENGTH_LONG).show()
        }

        //findviewbyid
        val encantan = findViewById<TextView>(R.id.textView1)

        /*val name = findViewById<EditText>(R.id.nombre)
        val boton = findViewById<Button>(R.id.botoncito)*/

        //sinteticos
        nombre.setText("Hola")



    }
}