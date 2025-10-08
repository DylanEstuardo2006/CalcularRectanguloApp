package com.example.calcularrectanguloapp.Model

import com.example.calcularrectanguloapp.Contract.ContractCuadrado
import com.example.calcularrectanguloapp.Contract.ContractTirangulo
import kotlin.math.sqrt

class ModelTriangulo: ContractTirangulo.modeloTriangulo {
    override fun calcularAreaTriangulo(lado1: Float, lado2: Float, lado3: Float): Float {
        val s = (lado1 + lado2 + lado3) / 2;
        val  resultado = sqrt(s*(s-lado1) * (s-lado2) * (s-lado3) );
        return resultado;
    }
    override fun calcularPerimetroTriangulo(lado1: Float, lado2: Float, lado3: Float): Float {
        return lado1 + lado2 + lado3;
    }

    override fun obtenerTipoTriangulo(lado1: Float, lado2: Float, lado3: Float): String {
        if(lado1 == lado2 && lado2 == lado3)
        {
            return "El triangulo es Equilatero"
        }
        else if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1)
        {
            return "El triangulo es Escaleno";
        }
        else
        {
            return "El triangulo es Isosceles";
        }
    }

    override fun validarTriangulo(lado1: Float, lado2: Float, lado3: Float): Boolean
    {
       return(lado1 + lado2 > lado3 && lado3 + lado2 > lado1 && lado3 + lado1 > lado2);
    }
}