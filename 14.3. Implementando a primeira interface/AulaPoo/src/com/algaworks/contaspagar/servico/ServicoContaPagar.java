package com.algaworks.contaspagar.servico;

import com.algaworks.pagamento.Beneficiario;
import com.algaworks.pagamento.DocumentoPagavel;

public class ServicoContaPagar {

    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiChavePix()) {
            throw new RuntimeException("Beneficiário não possui chave Pix!");
        }

        System.out.printf("DEBUG: Efetuando PIX para %s no valor de %.2f coma a chave PIX: %s%n",
            beneficiario.getNome(), documento.getValorTotal(), beneficiario.getChavePix());
    }
}
