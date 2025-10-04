package com.example.calcularrectanguloapp.Presenter

import com.example.calcularrectanguloapp.Contract.ContractRectangulo
import com.example.calcularrectanguloapp.Model.ModelRectangulo

class PresenterRectangulo(private val vista: ContractRectangulo.VistaRectangulo): ContractRectangulo.PresentadorRectangulo
{
   private val modelo: ContractRectangulo.ModeloRectangulo = ModelRectangulo()

    override fun areaPresenter(base: Float, altura: Float)
    {
        if(modelo.validarRectangulo(base,altura) == true)
        {
            val area = modelo.calcularArea(base,altura);
            vista.showArea(area);
        }
        else
        {
            vista.showError("Datos invalidos");
        }
    }

    override fun perimetroPresenter(base: Float, altura: Float)
    {
        if(modelo.validarRectangulo(base,altura) == true)
        {
            val perimetro = modelo.calcularPerimetro(base,altura);
            vista.showPerimetro(perimetro);
        }
        else
        {
            vista.showError("Datos invalidos");
        }
    }

}