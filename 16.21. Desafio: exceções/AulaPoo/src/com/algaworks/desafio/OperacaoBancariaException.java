package com.algaworks.desafio;

public class OperacaoBancariaException extends RuntimeException {
    public OperacaoBancariaException(String message) {
        super(message);
    }

    public OperacaoBancariaException(String message, Throwable cause) {
        super(message, cause);
    }
}
