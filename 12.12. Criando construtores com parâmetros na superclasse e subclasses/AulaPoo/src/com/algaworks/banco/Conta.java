package com.algaworks.banco;

public class Conta {

    private Titular titualar;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(Titular titualar, int agencia, int numero) {
        this.titualar = titualar;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Titular getTitualar() {
        return titualar;
    }


    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }


    protected void validarSaldoParaSaque(double valor) {
        if (getSaldo() < valor) {
            throw new RuntimeException("Saldo insuficiente para saque!");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }

        validarSaldoParaSaque(valor);
        saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
        }

        saldo += valor;
    }

    public void imprimirDemonstrativo() {
        System.out.println("----------- DEMOSNTRATIVO -----------");
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitualar().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }
}
