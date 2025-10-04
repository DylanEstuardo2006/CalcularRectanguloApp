package com.example.calcularrectanguloapp.Contract

interface ContractHexagono
{
   interface modelHexagono
   {
       fun calcularArea(lado: Float, apotema: Float): Float;
       fun calcularPerimetro(lado: Float): Float;
       fun validarHexagono(lado: Float, apotema: Float): Boolean;
   }

    interface presenterHexagono
    {
        fun presenterArea(lado: Float, apotema: Float);
        fun presenterPerimetro(lado: Float, apotema: Float);
    }

    interface vistaHexagono
    {
        fun showArea(area: Float);
        fun showPerimetro(Perimetro: Float);
        fun showError(msg: String);
    }
}