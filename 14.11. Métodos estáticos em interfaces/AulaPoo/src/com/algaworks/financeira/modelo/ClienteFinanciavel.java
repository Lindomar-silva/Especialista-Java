package com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolictado) {
        return isFinanciamentoMenorValor(valorSolictado) ? 1.0 :
            isFinanciamentoGrandeValor(valorSolictado) ? 1.5 : 2.0;
    }

    static boolean isFinanciamentoGrandeValor(double valorSolictado) {
        return valorSolictado <= 1_000_000;
    }

    static boolean isFinanciamentoMenorValor(double valorSolictado) {
        return valorSolictado <= 100_000;
    }
}

