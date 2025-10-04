package com.example.calcularrectanguloapp.Model

import com.example.calcularrectanguloapp.Contract.ContractHexagono

class ModeloHexagono: ContractHexagono.modelHexagono
{
    override fun calcularArea(lado: Float, apotema: Float): Float {
         val perimetrotemp: Float = lado * 6f;
         return (perimetrotemp * apotema) / 2f;
    }

    override fun calcularPerimetro(lado: Float): Float {
      return lado * 6f;
    }

    override fun validarHexagono(lado: Float, apotema: Float): Boolean {
        return (lado > 0  && apotema > 0)
    }

}