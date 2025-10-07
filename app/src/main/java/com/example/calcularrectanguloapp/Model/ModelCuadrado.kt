package com.example.calcularrectanguloapp.Model

import com.example.calcularrectanguloapp.Contract.ContractCuadrado

class ModelCuadrado: ContractCuadrado.modelCuadrado {
    override fun calcularAreaCuadrado(lado: Float): Float {
        return lado * lado;
    }

    override fun calcularPerimetroCuadrado(lado: Float): Float {
       return lado * 4;
    }

    override fun validarCuadrado(lado: Float): Boolean {
        return (lado > 0 );
    }
}