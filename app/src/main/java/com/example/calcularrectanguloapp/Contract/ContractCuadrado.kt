package com.example.calcularrectanguloapp.Contract

interface ContractCuadrado
{
    interface vistaCuadrado
    {
       fun showAreaCuadrado(area: Float);
        fun showPerimetroCuadrado(perimetro: Float);
        fun showError(msg: String);
    }
    interface modelCuadrado
    {
        fun calcularAreaCuadrado(lado: Float): Float;
        fun calcularPerimetroCuadrado(lado:Float): Float;
        fun validarCuadrado(lado: Float): Boolean;
    }
    interface presenterCuadrado
    {
        fun presenterAreaCuadrado(lado: Float);
        fun presenterPerimetroCuadrado(lado: Float);
    }
}