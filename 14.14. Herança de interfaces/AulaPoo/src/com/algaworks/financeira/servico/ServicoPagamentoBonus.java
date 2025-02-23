package com.algaworks.financeira.servico;

import com.algaworks.financeira.modelo.PessoBonificavel;

public class ServicoPagamentoBonus {

    public void pagar(PessoBonificavel pessoa, double percentualMetaAlcancada) {
        double valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);
        // Implementação da lógica de pagamento

        System.out.printf("DEBUG: Bônus psgo no valor de %.2f%n", valorBonus);
    }

}
