package com.algaworks.seguros.modelo;

public class CarroParticular extends VeiculoAutomotor {

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double valorCarro = getValorMercado() * 0.04;

        if (getAnoFabricacao() < 2000) {
            valorCarro *= 1.05;
        }

        return valorCarro;
    }

    @Override
    public String descrever() {
        return String.format("Carro particular %s ano %d, avaliado em R$ %.2f",
                getModelo(), getAnoFabricacao(), getValorMercado());
    }
}

