package com.algaworks.estoque.exception;

public class ProdutoSemEstoqueException extends RuntimeException {
    public ProdutoSemEstoqueException(String message) {
        super(message);
    }
}
