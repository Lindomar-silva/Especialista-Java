package com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {

    double JUROS_BAIXO_RISCO = 1.0;
    double JUROS_MEDIO_RISCO = 1.5;
    double JUROS_ALTO_RISCO = 2.0;

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolictado) {
        return isFinanciamentoMenorValor(valorSolictado) ? JUROS_BAIXO_RISCO :
            isFinanciamentoGrandeValor(valorSolictado) ? JUROS_MEDIO_RISCO : JUROS_ALTO_RISCO;
    }

    static boolean isFinanciamentoGrandeValor(double valorSolictado) {
        return valorSolictado <= 1_000_000;
    }

    static boolean isFinanciamentoMenorValor(double valorSolictado) {
        return valorSolictado <= 100_000;
    }
}

