package com.example.calcularrectanguloapp.Contract

interface ContractCirculo
{
    interface vistaCirculo
    {
        fun showArea(area: Float);
        fun showPerimetro(perimetro: Float);
        fun showError(msg: String);
    }
    interface modelCirculo
    {
        fun calcularArea(diametro: Float): Float;
        fun calcularPerimetro(diametro: Float): Float;
        fun validarCirculo(diametro: Float): Boolean;
    }
    interface presenterCirculo
    {
        fun calcularArea(diametro: Float);
        fun calcularPerimetro(diametro: Float);
    }
}