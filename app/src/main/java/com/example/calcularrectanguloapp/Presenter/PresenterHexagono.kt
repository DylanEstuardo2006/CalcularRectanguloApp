package com.example.calcularrectanguloapp.Presenter

import com.example.calcularrectanguloapp.Contract.ContractCirculo
import com.example.calcularrectanguloapp.Contract.ContractHexagono
import com.example.calcularrectanguloapp.Model.ModeloHexagono

class PresenterHexagono(private val vista: ContractHexagono.vistaHexagono): ContractHexagono.presenterHexagono
{
    private val modelo: ContractHexagono.modelHexagono = ModeloHexagono();

    override fun presenterArea(lado: Float, apotema: Float){
       if(modelo.validarHexagono(lado,apotema))
       {
           val area = modelo.calcularArea(lado,apotema)
           vista.showArea(area);
       }
        else
       {
           vista.showError("Datos no validos");
       }
    }

    override fun presenterPerimetro(lado: Float,apotema: Float) {
       if(modelo.validarHexagono(lado,apotema))
       {
             val perimetro = modelo.calcularPerimetro(lado);
               vista.showPerimetro(perimetro);
       }
        else
       {
           vista.showError("Datos no validos");
       }
    }

}