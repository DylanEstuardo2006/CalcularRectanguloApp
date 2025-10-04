package com.example.calcularrectanguloapp.Vista

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calcularrectanguloapp.Contract.ContractRectangulo
import com.example.calcularrectanguloapp.Presenter.PresenterRectangulo
import com.example.calcularrectanguloapp.R
import org.w3c.dom.Text


class MainActivity : AppCompatActivity(), ContractRectangulo.VistaRectangulo {
    private lateinit var  txtResultado: TextView;
    private lateinit var presentador: ContractRectangulo.PresentadorRectangulo;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val txtbase = findViewById<EditText>(R.id.edtbase);
        val txtarea = findViewById<EditText>(R.id.edtaltura);
        val btnArea = findViewById<Button>(R.id.btnArea);
        val btnPerimetro = findViewById<Button>(R.id.btnPerimetro);
        txtResultado = findViewById<TextView>(R.id.txtVResultado);

        presentador = PresenterRectangulo(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnArea.setOnClickListener {
            val base = txtbase.text.toString().toFloat();
            val altura = txtarea.text.toString().toFloat();
            presentador.areaPresenter(base,altura);
        }
        btnPerimetro.setOnClickListener{
            val base = txtbase.text.toString().toFloat();
            val altura = txtarea.text.toString().toFloat();
            presentador.perimetroPresenter(base,altura);
        }
    }

    override fun showArea(area: Float) {
        txtResultado.text = "El área del cuadrado es: ${area}";
    }

    override fun showPerimetro(perimetro: Float) {
        txtResultado.text = "El perimetro es: ${perimetro}";
    }

    override fun showError(msg: String) {
        txtResultado.text = msg;
    }
}