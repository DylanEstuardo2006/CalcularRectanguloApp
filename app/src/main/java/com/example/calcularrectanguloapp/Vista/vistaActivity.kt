package com.example.calcularrectanguloapp.Vista

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calcularrectanguloapp.Contract.ContractCirculo
import com.example.calcularrectanguloapp.Contract.ContractRectangulo
import com.example.calcularrectanguloapp.Presenter.PresenterCirculo
import com.example.calcularrectanguloapp.Presenter.PresenterRectangulo
import com.example.calcularrectanguloapp.R

class vistaActivity: AppCompatActivity(), ContractCirculo.vistaCirculo {

    private lateinit var  txtResultado: TextView;
    private lateinit var  presentador: ContractCirculo.presenterCirculo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.appcirculo_main)
        val txtdiametro = findViewById<EditText>(R.id.edtdiametro)
        val btnAreaC = findViewById<Button>(R.id.btnAreaC);
        val btnPerimetroC = findViewById<Button>(R.id.btnPerimetroC);
        txtResultado = findViewById<TextView>(R.id.txtVResultadoC);


        presentador = PresenterCirculo(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainCirculo)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnAreaC.setOnClickListener {
            val diametroA = txtdiametro.text.toString().toFloat();
            presentador.calcularArea(diametroA);
        }
        btnPerimetroC.setOnClickListener {
            val diametroP = txtdiametro.text.toString().toFloat();
            presentador.calcularPerimetro(diametroP)
        }

    }

    override fun showArea(area: Float)
    {
       txtResultado.text = "El área es: ${area}";
    }

    override fun showPerimetro(perimetro: Float) {
      txtResultado.text = "El perímetro es: ${perimetro}"
    }

    override fun showError(msg: String) {
       txtResultado.text = msg;
    }
}
