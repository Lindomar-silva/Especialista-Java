package com.algaworks.comercial;

public class Cliente {

    private String nome;
    private double limiteCompra;

    public Cliente(String nome, double limiteCompra) {
        this.nome = nome;
        this.limiteCompra = limiteCompra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }

}
