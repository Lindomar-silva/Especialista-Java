package com.algaworks;

public record Holerite(String nome, String mesAno, double valorSalario) {

    public void imprimir() {
        System.out.printf("Salário de: %s, referente a data: %s, valor do salário: R$ %.2f%n", nome, mesAno, valorSalario);
    }
}

