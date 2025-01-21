package com.algaworks.java.servico;

import com.algaworks.java.Cartao;
import com.algaworks.java.Estabelecimento;
import com.algaworks.java.Recibo;

public class ServicoPagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {

        cartao.debitar(valor);

        // TODO realiza outras lógicas para efetuar o pagamento ao estbelecimento

        return new Recibo(cartao.obterTitular(), "Pagamento", valor);
    }
}
