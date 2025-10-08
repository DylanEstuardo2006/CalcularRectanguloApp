package com.example.calcularrectanguloapp.Contract

interface ContractTirangulo
{
    interface modeloTriangulo {
        fun calcularAreaTriangulo(lado1: Float, lado2: Float, lado3: Float): Float;
        fun calcularPerimetroTriangulo(lado1: Float, lado2: Float, lado3: Float): Float;
        fun obtenerTipoTriangulo(lado1: Float, lado2: Float, lado3: Float): String;
        fun validarTriangulo(lado1: Float, lado2: Float, lado3: Float): Boolean;
    }

    interface presenterTriangulo {
        fun presenterAreaTriangulo(lado1: Float, lado2: Float, lado3: Float);
        fun presenterPerimetroTriangulo(lado1: Float, lado2: Float, lado3: Float);
        fun presenterTipoTriangulo(lado1: Float, lado2: Float, lado3: Float);
    }

    interface vistaTriangulo
    {
        fun showAreaTriangulo(area: Float);
        fun showPerimetroTriangulo(perimetro: Float);
        fun showTipoTriangulo(tipo: String);
        fun showErrorTriangulo(msg: String);
    }
}