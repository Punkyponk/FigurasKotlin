package com.example.figuras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.BaseAdapter
import android.widget.EditText
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image1: ImageView = findViewById(R.id.image1)
        val image2: ImageView = findViewById(R.id.image2)
        val base: EditText = findViewById(R.id.base)
        val altura: EditText = findViewById((R.id.altura))
        val lado: EditText = findViewById(R.id.lado)



        image1.setOnClickListener{
            Toast.makeText(this, "Seleccionaste el Cuadrado", Toast.LENGTH_SHORT).show()
            Triangulo()
        }
        image2.setOnClickListener{
            Toast.makeText(this, "Seleccionaste el Triangulo Equilatero", Toast.LENGTH_SHORT).show()
            Cuadrado()
        }
    }

    private fun Triangulo(){
        val switch1: Switch = findViewById(R.id.switch1)
        val base: EditText = findViewById(R.id.base)
        val altura: EditText = findViewById((R.id.altura))
        base.isEnabled = true
        altura.isEnabled = true
        val basestr = base.text.toString()
        val alturastr = altura.text.toString()
        if(switch1.isChecked){
            val baseint = basestr.toInt()
            var perimetro = baseint * 3
            val result: TextView = findViewById(R.id.result1)
            result.text = perimetro.toString()
        }else{
            val alturaint = alturastr.toInt()
            val baseint = basestr.toInt()
            var area = (baseint * alturaint)/2
            val result: TextView = findViewById(R.id.result1)
            result.text = area.toString()
        }

    }
    private fun Cuadrado(){
        val result: TextView = findViewById(R.id.result1)
        val switch1: Switch = findViewById(R.id.switch1)
        val lado: EditText = findViewById(R.id.lado)
        val ladostr = lado.text.toString()

        if(switch1.isChecked){
            val ladoint = ladostr.toInt()
            var perimetro = ladoint * 4
            result.text = perimetro.toString()
        }else{
            val ladoint = ladostr.toInt()
            var area = ladoint * ladoint
            result.text = area.toString()
        }

    }
}