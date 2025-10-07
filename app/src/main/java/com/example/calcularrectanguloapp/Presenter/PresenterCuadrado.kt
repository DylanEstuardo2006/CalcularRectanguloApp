package com.example.calcularrectanguloapp.Presenter

import com.example.calcularrectanguloapp.Contract.ContractCuadrado
import com.example.calcularrectanguloapp.Model.ModelCuadrado

class PresenterCuadrado(private val vista: ContractCuadrado.vistaCuadrado): ContractCuadrado.presenterCuadrado {
    private val modelo: ContractCuadrado.modelCuadrado = ModelCuadrado();

    override fun presenterAreaCuadrado(lado: Float) {
      if(modelo.validarCuadrado(lado))
      {
          val area = modelo.calcularAreaCuadrado(lado);
          vista.showAreaCuadrado(area);
      }
        else
      {
          vista.showError("Datos no validos");
      }
    }

    override fun presenterPerimetroCuadrado(lado: Float) {
        if(modelo.validarCuadrado(lado))
        {
            val perimetro = modelo.calcularPerimetroCuadrado(lado);
            vista.showPerimetroCuadrado(perimetro);
        }
        else
        {
            vista.showError("Datos no validos");
        }
    }
}