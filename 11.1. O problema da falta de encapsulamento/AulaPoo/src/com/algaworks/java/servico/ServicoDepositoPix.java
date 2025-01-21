package com.algaworks.java.servico;

import com.algaworks.java.Cartao;
import com.algaworks.java.Recibo;

public class ServicoDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valor) {
        // TODO faz cobrança do valor PIX

        if (valor < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                String.format("Valor de depósito não pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }

        cartao.saldo += valor - Cartao.TARIFA_DEPOSITO;
        return new Recibo(cartao.titular, "Depósito", valor);
    }
}
