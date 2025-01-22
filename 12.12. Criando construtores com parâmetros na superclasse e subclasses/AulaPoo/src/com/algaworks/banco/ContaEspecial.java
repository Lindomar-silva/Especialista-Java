package com.algaworks.banco;

public class ContaEspecial extends ContaInvestimento {

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(Titular titualar, int agencia, int numero, double tarifaMensal) {
        super(titualar, agencia, numero);
        this.tarifaMensal = tarifaMensal;
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
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    private double getSaldoDisponvel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    @Override
    public void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo disponível: %.2f%n", getSaldoDisponvel());
    }

    @Override
    protected void validarSaldoParaSaque(double valor) {
        if (getSaldoDisponvel() < valor) {
            throw new RuntimeException("Saldo insuficiente para saque!");
        }
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }
}
