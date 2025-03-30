package com.algaworks.comercial;

import java.util.Objects;

public class ItemVenda {

    private final String descriacao;
    private final double valor;

    public ItemVenda(String descriacao, double valor) {
        Objects.requireNonNull(descriacao);

        if (valor < 0) {
            throw new IllegalArgumentException("Valor do item deve ser positivo!");
        }

        this.descriacao = descriacao;
        this.valor = valor;
    }

    public String getDescriacao() {
        return descriacao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
            "descriacao='" + descriacao + '\'' +
            ", valor=" + valor +
            '}';
    }
}
