package com.example.calcularrectanguloapp.Presenter

import com.example.calcularrectanguloapp.Contract.ContractCirculo
import com.example.calcularrectanguloapp.Model.ModeloCirculo

class PresenterCirculo (private val vista: ContractCirculo.vistaCirculo): ContractCirculo.presenterCirculo
{
    private var  modelo: ContractCirculo.modelCirculo = ModeloCirculo();
    override fun calcularArea(diametro: Float) {
        if(modelo.validarCirculo(diametro))
        {
            val area = modelo.calcularArea(diametro);
            vista.showArea(area);
        }
        else
        {
            vista.showError("Datos no válidos");
        }
    }

    override fun calcularPerimetro(diametro: Float){
        if(modelo.validarCirculo(diametro))
        {
            val perimetro = modelo.calcularPerimetro(diametro);
            vista.showPerimetro(perimetro);
        }
        else
        {
            vista.showError("Datos no válidos");
        }
    }
}