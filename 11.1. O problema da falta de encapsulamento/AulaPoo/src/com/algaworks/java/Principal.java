package com.algaworks.java;

import com.algaworks.java.servico.ServicoDepositoPix;
import com.algaworks.java.servico.ServicoPagamentoOnline;

public class Principal {

    public static void main(String[] args) {
        Estabelecimento supermercado = new Estabelecimento("Supermercado do Zé");
        Cartao cartao = new Cartao("João da Silva");

        ServicoDepositoPix servicoDepositoPix = new ServicoDepositoPix();

        Recibo recibo = servicoDepositoPix.efetuarDeposito(cartao, 500);
        recibo.imprimir();

        ServicoPagamentoOnline servicoPagamentoOnline = new ServicoPagamentoOnline();
        Recibo reciboPagamento = servicoPagamentoOnline.efetuarPagamento(supermercado, cartao, 450);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.titular);
        System.out.printf("Saldo: %.2f%n", cartao.saldo);
    }
}
