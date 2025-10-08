package com.example.calcularrectanguloapp.Vista

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calcularrectanguloapp.R

class menuFiguras : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_figuras)
        val  spinner = findViewById<Spinner>(R.id.spnOpcion)
        val boton = findViewById<Button>(R.id.btnIr)
        val opciones = arrayOf("Hexagono","Circulo","Rectangulo","Cuadrado","Triangulo");
        val adaptador = ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,opciones);
        spinner.adapter = adaptador;

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainFiguras)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        boton.setOnClickListener{
            when(spinner.selectedItem.toString())
            {
                "Hexagono" ->
                {
                    val intent = Intent(this, HexagonoActivity::class.java)
                   startActivity(intent);
                }
                "Circulo" ->
                {
                    val intent = Intent(this, vistaActivity::class.java)
                    startActivity(intent);
                }
                "Rectangulo" ->
                {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent);
                }
                "Cuadrado" ->
                {
                    val intent = Intent(this, cuadradoActiviy::class.java)
                    startActivity(intent);
                }
                "Triangulo" ->
                {
                    val intent = Intent(this, TrianguloActivity::class.java)
                    startActivity(intent);
                }
            }
        }
    }
}