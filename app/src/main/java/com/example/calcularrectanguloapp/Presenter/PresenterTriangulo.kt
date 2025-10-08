package com.example.calcularrectanguloapp.Presenter

import com.example.calcularrectanguloapp.Contract.ContractTirangulo
import com.example.calcularrectanguloapp.Model.ModelTriangulo

class PresenterTriangulo(private val vista: ContractTirangulo.vistaTriangulo): ContractTirangulo.presenterTriangulo {
    private val modelo: ContractTirangulo.modeloTriangulo = ModelTriangulo();

    override fun presenterAreaTriangulo(lado1: Float, lado2: Float, lado3: Float) {
       if(modelo.validarTriangulo(lado1,lado2,lado3))
       {
           val area = modelo.calcularAreaTriangulo(lado1,lado2,lado3);
           vista.showAreaTriangulo(area);
       }
        else
       {
           vista.showErrorTriangulo("Datos no validos");
       }
    }

    override fun presenterPerimetroTriangulo(lado1: Float, lado2: Float, lado3: Float) {
       if(modelo.validarTriangulo(lado1,lado2,lado3))
       {
           val perimetro = modelo.calcularPerimetroTriangulo(lado1,lado2,lado3);
           vista.showPerimetroTriangulo(perimetro);
       }
        else
       {
           vista.showErrorTriangulo("Datos no validos");
       }
    }

    override fun presenterTipoTriangulo(lado1: Float, lado2: Float, lado3: Float)
    {
       if(modelo.validarTriangulo(lado1,lado2,lado3))
       {
           val tipoTriangulo = modelo.obtenerTipoTriangulo(lado1,lado2,lado3);
           vista.showTipoTriangulo(tipoTriangulo);
       }
        else
       {
           vista.showErrorTriangulo("Datos no validos");
       }
    }

}