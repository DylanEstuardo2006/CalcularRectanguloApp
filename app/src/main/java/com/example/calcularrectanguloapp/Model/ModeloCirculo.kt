package com.example.calcularrectanguloapp.Model

import com.example.calcularrectanguloapp.Contract.ContractCirculo
import kotlin.math.PI
import kotlin.math.pow

class ModeloCirculo: ContractCirculo.modelCirculo
{
    override fun calcularArea(diametro: Float): Float
    {
        val radio = diametro / 2;
        return PI.toFloat() * radio.pow(2)
    }

    override fun calcularPerimetro(diametro: Float): Float {
        return Math.PI.toFloat() * diametro;
    }

    override fun validarCirculo(diametro: Float): Boolean {
        return (diametro > 0);
    }
}