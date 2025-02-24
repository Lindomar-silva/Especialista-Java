import com.algaworks.estoque.Produto;
import com.algaworks.estoque.exception.ProdutoInativoException;
import com.algaworks.estoque.exception.ProdutoSemEstoqueException;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");
        produto.ativar();
        produto.adicionarEstoque(20);

        comprar(produto);
    }

    private static void comprar(Produto produto) {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                efetuarBaixaEstoque(produto, quantidade);
                System.out.println("Compra realizada");

                break;
            } catch (IllegalArgumentException | ProdutoSemEstoqueException e) {
                System.out.println("Erro nba compra: " + e.getMessage());
            } catch (ProdutoInativoException e) {
                System.out.println("Erro nba compra: " + e.getMessage());

                System.out.print("Deseja ativar o produto? ");

                if (scanner.nextBoolean()) {
                    produto.ativar();
                    System.out.println("Ok. Produto foi ativado!");
                } else {
                    System.out.println("Ok. Compra não pode ser realizada!");
                    break;
                }
            }
        } while (true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) {
//        try {
        produto.retirarEstoque(quantidade);
        System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
            quantidade, produto.getQuantidadeEstoque());

//        } catch (IllegalArgumentException e) {
//            System.out.println("Erro ao efetuar baixa no estoque: " + e.getMessage());
//            throw e;
//        }
    }

}