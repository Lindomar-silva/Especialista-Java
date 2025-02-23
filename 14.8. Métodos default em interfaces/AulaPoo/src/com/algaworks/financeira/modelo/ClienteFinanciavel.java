package com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolictado) {
        return (valorSolictado <= 100_000) ? 1.0 : (valorSolictado <= 1_000_000) ? 1.5 : 2.0;
    }
}

