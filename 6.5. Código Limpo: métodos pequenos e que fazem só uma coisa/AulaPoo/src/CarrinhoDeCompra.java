public class CarrinhoDeCompra {

    static final double TAXA_SERVICO_PADRAO = 0.10;
    int quantidadeItens;
    Produto produto;

    void realizarCompra(String numeroCartao) {
        double valorTotal = calcularValorTotal();

        boolean pagamentoAutorizado = GatewayPagamento
            .autorizarPagfamento(numeroCartao, valorTotal);

        if (pagamentoAutorizado) {
            imprimirRecibo(valorTotal);
        }
    }

    static void imprimirRecibo(double valorTotal) {
        System.out.println("RECIBO DE PAGAMENTO");
        System.out.printf("Valor total: R$ %.2f%n", valorTotal);
    }

    double calcularValorTotal() {
        double subtotal = calcularSubTotal();
        double taxaServico = calcularTaxaServico(subtotal);
        return subtotal + taxaServico;
    }

    static double calcularTaxaServico(double sbtotal) {
        return sbtotal * TAXA_SERVICO_PADRAO;
    }

    double calcularSubTotal() {
        return produto.precoUnitario * quantidadeItens;
    }
}

