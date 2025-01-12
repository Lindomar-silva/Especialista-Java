public class Principal {

    public static void main(String[] args) {

        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        Produto produto = new Produto();
        produto.nome = "Água";
        produto.precoUnitario = 5;

        carrinho.adicionarItem(produto);

        produto.ativar();
        produto.inativar();
    }

}
