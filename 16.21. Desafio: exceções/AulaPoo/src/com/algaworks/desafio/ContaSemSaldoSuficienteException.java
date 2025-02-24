package com.algaworks.desafio;

public class ContaSemSaldoSuficienteException extends OperacaoBancariaException {

    public ContaSemSaldoSuficienteException(String message) {
        super(message);
    }

    public ContaSemSaldoSuficienteException(String message, Throwable cause) {
        super(message, cause);
    }
}
