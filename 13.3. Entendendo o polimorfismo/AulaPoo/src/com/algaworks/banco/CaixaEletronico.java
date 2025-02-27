package com.algaworks.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;

    public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        System.out.printf("Transfereindo R$ %.2f da conta %d/%d para %d/%d%n",
            valor, contaOrigem.getAgencia(), contaOrigem.getNumero(),
            contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valor + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valor);
    }
}
