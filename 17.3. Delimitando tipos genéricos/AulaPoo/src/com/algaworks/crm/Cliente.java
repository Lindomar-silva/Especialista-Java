package com.algaworks.crm;

public class Cliente implements Nomeavel, PessoaJuridica{

    private String razaoSocial;
    private double faturamentoMensal;

    public Cliente(String razaoSocial, double faturamentoMensal) {
        this.razaoSocial = razaoSocial;
        this.faturamentoMensal = faturamentoMensal;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public double getFaturamentoMensal() {
        return faturamentoMensal;
    }

    @Override
    public String toString() {
        return "Cliente{" +
            "razaoSocial='" + razaoSocial + '\'' +
            ", faturamentoMensal=" + faturamentoMensal +
            '}';
    }

    @Override
    public String getNome() {
        return getRazaoSocial();
    }
}
