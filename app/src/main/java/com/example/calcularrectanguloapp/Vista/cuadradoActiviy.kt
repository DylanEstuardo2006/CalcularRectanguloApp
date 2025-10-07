package com.example.calcularrectanguloapp.Vista

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calcularrectanguloapp.Contract.ContractCuadrado
import com.example.calcularrectanguloapp.Contract.ContractHexagono
import com.example.calcularrectanguloapp.Presenter.PresenterCuadrado
import com.example.calcularrectanguloapp.Presenter.PresenterHexagono
import com.example.calcularrectanguloapp.R

class cuadradoActiviy : AppCompatActivity(), ContractCuadrado.vistaCuadrado{

    private lateinit var  txtResAreaCua: TextView;
    private lateinit var  txtResPerimetroCua: TextView;

    private lateinit var  presentador: ContractCuadrado.presenterCuadrado;

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cuadrado_activiy)

        val txtladoCuadrado = findViewById<EditText>(R.id.edtladoCuadrado);
        val btnCuadrado = findViewById<Button>(R.id.btnCalcularCuadrado);
        txtResAreaCua = findViewById<TextView>(R.id.txtVAreaCuadrado);
        txtResPerimetroCua = findViewById<TextView>(R.id.txtVPerimetroCuadrado);

        presentador = PresenterCuadrado(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        btnCuadrado.setOnClickListener {
            val ladoCuadradoVal = txtladoCuadrado.text.toString().toFloat();
            presentador.presenterAreaCuadrado(ladoCuadradoVal);
            presentador.presenterPerimetroCuadrado(ladoCuadradoVal);

        }

    }

    override fun showAreaCuadrado(area: Float) {
       txtResAreaCua.text = "El área es:  ${area}";
    }

    override fun showPerimetroCuadrado(perimetro: Float) {
        txtResPerimetroCua.text = "El perimetro es: ${perimetro} ";
    }

    override fun showError(msg: String) {
       txtResAreaCua.text = msg;
        txtResPerimetroCua.text = msg;
    }
}