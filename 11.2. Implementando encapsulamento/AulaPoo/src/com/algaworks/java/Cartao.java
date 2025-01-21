package com.algaworks.java;

public class Cartao {

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String titular;
    private double saldo;

    public Cartao(String titular) {
        this.titular = titular;
    }

    public String obterTitular() {
        return titular;
    }

    public double obterSaldo() {
        return saldo;
    }

    public void debitar(double valor) {
        if (obterSaldo() < valor) {
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        this.saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor < VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                String.format("Valor de depósito não pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }

        this.saldo += valor - TARIFA_DEPOSITO;
    }
}
