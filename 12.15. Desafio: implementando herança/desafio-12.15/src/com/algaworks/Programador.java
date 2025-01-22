package com.algaworks;

public class Programador extends Funcionario {

    private double valorBonus;

    public Programador(String nome, double valorHora) {
        super(nome, valorHora);
    }

    public double getValorBonus() {
        if (valorBonus < 0) {
            throw new RuntimeException("Valor bônus deve ser maior que 0");
        }
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    @Override
    protected final double calcularSalario(double horasTrabalhadas) {
        return super.calcularSalario(horasTrabalhadas) + getValorBonus();
    }

//    @Override
//    public String toString() {
//        return "Programador{" +
//                super.toString() +
//                ", valorBonus=" + valorBonus +
//                "}";
//    }


    @Override
    public String toString() {
        return "Programador{" +
                "nome='" + getNome() + '\'' +
                ", valorHora=" + getValorHora() +
                ", valorBonus=" + valorBonus +
                "}";
    }
}
