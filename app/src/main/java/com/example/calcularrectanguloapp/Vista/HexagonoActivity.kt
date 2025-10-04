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
import com.example.calcularrectanguloapp.Contract.ContractHexagono
import com.example.calcularrectanguloapp.Presenter.PresenterCirculo
import com.example.calcularrectanguloapp.Presenter.PresenterHexagono
import com.example.calcularrectanguloapp.R


class HexagonoActivity: AppCompatActivity(), ContractHexagono.vistaHexagono
{
    private lateinit var  txtResArea: TextView;
    private lateinit var  txtResPerimetro: TextView;
    private lateinit var  presentador: ContractHexagono.presenterHexagono
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.apphexagono_main)
        val txtApotema = findViewById<EditText>(R.id.edtApotema);
        val txtlado = findViewById<EditText>(R.id.edtlado);
        val btnCalcular = findViewById<Button>(R.id.btnCalcular);
       txtResArea = findViewById<TextView>(R.id.txtVAreaH);
        txtResPerimetro = findViewById<TextView>(R.id.txtVPerimetroH);

        presentador = PresenterHexagono(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainhexagono)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
       btnCalcular.setOnClickListener {
           val lado = txtlado.text.toString().toFloat();
           val apotema = txtApotema.text.toString().toFloat();
           presentador.presenterArea(lado,apotema);
           presentador.presenterPerimetro(lado,apotema);
       }


    }
    override fun showArea(area: Float) {
     txtResArea.text = "El àrea es: ${area}";
    }

    override fun showPerimetro(Perimetro: Float) {
     txtResPerimetro.text = "El perimetro es: ${Perimetro}";
    }

    override fun showError(msg: String) {
       txtResArea.text = msg;
        txtResPerimetro.text = msg;
    }
}