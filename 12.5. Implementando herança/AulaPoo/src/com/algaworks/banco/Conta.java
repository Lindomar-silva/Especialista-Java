package com.algaworks.banco;

public class Conta {

    private Titualar titualar;
    private int agencia;
    private int numero;
    private double saldo;

    public Titualar getTitualar() {
        return titualar;
    }

    public void setTitualar(Titualar titualar) {
        this.titualar = titualar;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }

        if (getSaldo() < valor) {
            throw new RuntimeException("Saldo insuficiente para saque!");
        }
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
