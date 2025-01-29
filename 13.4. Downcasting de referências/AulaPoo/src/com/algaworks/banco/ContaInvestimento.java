package com.algaworks.banco;

public class ContaInvestimento extends Conta {

    private double valorTotalRendimentos;

    public ContaInvestimento(Titular titualar, int agencia, int numero) {
        super(titualar, agencia, numero);
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void creditarRendiemntos(double percentualJuros) {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimentos += valorRendimentos;
        depositar(valorRendimentos);
    }

    @Override
    public String toString() {
        return "ContaInvestimento{" +
            "titular=" + getTitular() +
            ", agencia=" + getAgencia() +
            ", numero=" + getNumero() +
            ", valorTotalRendimentos=" + valorTotalRendimentos +
            '}';
    }
}
