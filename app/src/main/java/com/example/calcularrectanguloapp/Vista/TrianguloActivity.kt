package com.example.calcularrectanguloapp.Vista

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calcularrectanguloapp.Contract.ContractTirangulo
import com.example.calcularrectanguloapp.Presenter.PresenterTriangulo
import com.example.calcularrectanguloapp.R
import kotlin.toString

class TrianguloActivity : AppCompatActivity(), ContractTirangulo.vistaTriangulo
{

    private lateinit var txtResultadot: TextView;

    private lateinit var  presentador: ContractTirangulo.presenterTriangulo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_triangulo)

        val txtL1Triangulo = findViewById<EditText>(R.id.edtl1Triangulo);
        val txtL2Triangulo = findViewById<EditText>(R.id.edtl2Triangulo);
        val txtL3Triangulo = findViewById<EditText>(R.id.edtl3Triangulo);
        val btnAreaTriangulo = findViewById<Button>(R.id.btnAreaT);
        val btnPerimetroTriangulo = findViewById<Button>(R.id.btnPerimetroT);
        val btnTipoTriangulo = findViewById<Button>(R.id.btnTipoT);
        txtResultadot = findViewById<TextView>(R.id.edtlResultadoT);
        val btnRegresar = findViewById<Button>(R.id.btnVolverT);

        presentador = PresenterTriangulo(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        btnPerimetroTriangulo.setOnClickListener {
            val l1 = txtL1Triangulo.text.toString().toFloat();
            val l2 = txtL2Triangulo.text.toString().toFloat();
            val l3 = txtL3Triangulo.text.toString().toFloat();
            presentador.presenterPerimetroTriangulo(l1,l2,l3);
        }
        btnAreaTriangulo.setOnClickListener {
            val l1 = txtL1Triangulo.text.toString().toFloat();
            val l2 = txtL2Triangulo.text.toString().toFloat();
            val l3 = txtL3Triangulo.text.toString().toFloat();
            presentador.presenterAreaTriangulo(l1,l2,l3);
        }
        btnTipoTriangulo.setOnClickListener {
            val l1 = txtL1Triangulo.text.toString().toFloat();
            val l2 = txtL2Triangulo.text.toString().toFloat();
            val l3 = txtL3Triangulo.text.toString().toFloat();
            presentador.presenterTipoTriangulo(l1,l2,l3);
        }
        btnRegresar.setOnClickListener {
            val intent = Intent(this, menuFiguras::class.java)
            startActivity(intent);
        }
    }

    override fun showAreaTriangulo(area: Float) {
        txtResultadot.text = "El área es: ${area}"
    }

    override fun showPerimetroTriangulo(perimetro: Float) {
        txtResultadot.text = "El perimetro es: ${perimetro}"
    }

    override fun showTipoTriangulo(tipo: String) {
        txtResultadot.text = tipo;
    }

    override fun showErrorTriangulo(msg: String) {
        txtResultadot.text = msg;
    }
}