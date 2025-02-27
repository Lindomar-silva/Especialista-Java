package com.algaworks.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARIFA_IMPRESSAO_DEMONSTRATIVO = 5;

    public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        System.out.printf("Transfereindo R$ %.2f da conta %d/%d para %d/%d%n",
            valor, contaOrigem.getAgencia(), contaOrigem.getNumero(),
            contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valor + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valor);
    }

    public void imprimirDemonstrativo(Conta conta) {
//        if (conta instanceof ContaInvestimento) {
//            ContaInvestimento contaInvestimento = (ContaInvestimento) conta;
        if (conta instanceof ContaInvestimento contaInvestimento) {

            if (contaInvestimento.getValorTotalRendimentos() > 0) {
                System.out.println("Impressão gratuita de demonstrativo");

            } else {
                debitarTarifaImpressao(conta);
            }

        } else {
            debitarTarifaImpressao(conta);
        }


        conta.imprimirDemonstrativo();
    }

    private static void debitarTarifaImpressao(Conta conta) {
        System.out.printf("Custo tarifa de impressão: R$ %.2f%n", TARIFA_IMPRESSAO_DEMONSTRATIVO);
        conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
    }
}
