package com.algaworks.locadora;

public class Principal {

    public static void main(String[] args) {
        Notebook notebook = new Notebook("Macbook Pro i7 16GB", 5, 100);
//        Precificacao precificacao = new PrecificacaoPorHora();
        Precificacao precificacao = new PrecificacaoPorDia();
        Seguro seguro = new SeguroItau();

        Locacao locacao = new Locacao(notebook, precificacao, seguro);
        double valorDevido = locacao.calcularValorDevido(10);

        System.out.printf("Valor a pagar R$ %.2f", valorDevido);
    }
}
