package com.algaworks.impostos;

public class GestorDeImpostos {

    private double valorTotalImpostos;

    public void adicionar(Pessoa pessoa) {
        double imposto = pessoa.calcularImpostos();
        System.out.printf("Impostos devidos de %s: %.2f%n", pessoa.getNome(), imposto);

        valorTotalImpostos += imposto;
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }
}
