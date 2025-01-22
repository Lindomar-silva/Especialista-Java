package com.algaworks.banco;

public class Conta {

    public static final int NORMAL = 0;
    public static final int INVESTIMENTO = 1;
    public static final int ESPECIAL = 2;

    private Titualar titualar;
    private int agencia;
    private int numero;
    private double saldo;
    private int tipo = NORMAL;

    // Conta Investimento
    private double valorTotalRendimentos;

    // Conta Especial
    private double tarifaMensal;
    private double limiteChequeEspecial;

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

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        if (tipo != NORMAL && tipo != INVESTIMENTO && tipo != ESPECIAL) {
            throw new IllegalArgumentException("Tipo inválido: " + tipo);
        }

        this.tipo = tipo;

        if (this.tipo != ESPECIAL) {
            this.limiteChequeEspecial = 0;
        }
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        if (getTipo() != ESPECIAL) {
            throw new RuntimeException("Este tipo de conta não permite limite de cheque especial!");
        }

        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void creditarRendiemntos(double percentualJuros) {
        if (getTipo() == INVESTIMENTO || getTipo() == ESPECIAL) {
            double valorRendimentos = getSaldo() * percentualJuros / 100;
            this.valorTotalRendimentos += valorRendimentos;
            depositar(valorRendimentos);

        } else {
            throw new RuntimeException("Não pode creditar rendimentos neste tipo de conta!");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }

        if (getSaldoDisponivel() < valor) {
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
        System.out.printf("Saldo disponível: %.2f%n", getSaldoDisponivel());
    }

    public void debitarTarifaMensal() {
        if (getTipo() == ESPECIAL) {
            sacar(getTarifaMensal());

        } else {
            throw new RuntimeException("Não pode debitar tarifa mensal neste tipo de conta!");
        }
    }
}
