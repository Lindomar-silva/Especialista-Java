package com.algaworks.locadora;

public class Notebook {

    private String descricao;
    private double precoHora;
    private double precoPorDia;

    public Notebook(String descricao, double precoHora, double precoPorDia) {
        this.descricao = descricao;
        this.precoHora = precoHora;
        this.precoPorDia = precoPorDia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }
}
