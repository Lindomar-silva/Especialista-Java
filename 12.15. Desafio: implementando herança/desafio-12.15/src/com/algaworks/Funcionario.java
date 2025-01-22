package com.algaworks;

public class Funcionario {

    private String nome;
    private double valorHora;

    public Funcionario(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void etValorHora(double valorHora) {
        if (valorHora < 0) {
            throw new RuntimeException("Valor da hora deve ser maior que 0");
        }
        this.valorHora = valorHora;
    }

    protected double calcularSalario(double horasTrabalhadas) {
        return horasTrabalhadas * getValorHora();
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno) {
        double salario = calcularSalario(horasTrabalhadas);
        return new Holerite(getNome(), mesAno, salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", valorHora=" + valorHora +
                '}';
    }
}
