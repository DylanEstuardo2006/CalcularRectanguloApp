package com.example.calcularrectanguloapp.Contract

interface ContractRectangulo
{
    interface VistaRectangulo
    {
        fun showArea(area: Float);
        fun showPerimetro(perimetro: Float);
        fun showError(msg: String);
    }
    interface ModeloRectangulo
    {
        fun calcularArea(base: Float, altura: Float): Float;
        fun calcularPerimetro(base: Float, altura: Float): Float;
        fun validarRectangulo(base: Float, altura: Float): Boolean;
    }
    interface PresentadorRectangulo
    {
        fun areaPresenter(base: Float, altura: Float);
        fun perimetroPresenter(base: Float, altura: Float);
    }
}