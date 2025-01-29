package com.algaworks.impostos;

public class PessoaFisica extends Pessoa {

    public static final double RECEITA_ANUAL_ISENCAO = 50000;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        double imposto = getReceitaAnual() * ALIQUOTA_IMPOSTO_RENDA;

        if (isIsentoImposto()) {
            imposto = 0;
        }
        return imposto;
    }

    private boolean isIsentoImposto() {
        return getReceitaAnual() <= RECEITA_ANUAL_ISENCAO;
    }
}
