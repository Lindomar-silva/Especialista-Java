package com.algaworks.java.servico;

import com.algaworks.java.Cartao;
import com.algaworks.java.Recibo;

public class ServicoDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valor) {
        // TODO faz cobrança do valor PIX

        cartao.depositar(valor);
        return new Recibo(cartao.obterTitular(), "Depósito", valor);
    }
}
