package com.example.calcularrectanguloapp.Model

import com.example.calcularrectanguloapp.Contract.ContractRectangulo

class ModelRectangulo: ContractRectangulo.ModeloRectangulo
{
    override fun calcularArea(base: Float, altura: Float): Float {
        val resultado: Float = base * altura;
        return resultado;
    }

    override fun calcularPerimetro(base: Float, altura: Float): Float {
       val resultado: Float = (base * 2) + (altura * 2);
        return resultado;
    }

    override fun validarRectangulo(base: Float, altura: Float): Boolean {
     return (base != altura);
    }


}