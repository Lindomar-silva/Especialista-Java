import com.algaworks.estruturadedados.Colecao;
import com.algaworks.estruturadedados.ColecaoVazuaException;
import com.algaworks.estruturadedados.Fila;
import com.algaworks.estruturadedados.Pilha;
import com.algaworks.loja.Produto;

public class Principal {

    public static void main(String[] args) {
//        Colecao<Produto> produtos = new Pilha<>();
        Colecao<Produto> produtos = new Fila<>();
        produtos.colocar(new Produto("Arroz"));
        produtos.colocar(new Produto("Feijão"));
        produtos.colocar(new Produto("Ágaua de coco"));

        retirarTodos(produtos);

        Colecao<String> nomes = new Pilha<>();
        nomes.colocar("Jpão");
        nomes.colocar("Maria");

        retirarTodos(nomes);
    }

    private static void retirarTodos(Colecao<?> produtos) {
        try {
            int i = 1;
            while (true) {
                Object object = produtos.retirar();
                System.out.printf("%d. %s%n", i, object);
                i++;
            }

        } catch (ColecaoVazuaException e) {
            System.out.println("Coleção de produtos esgotada!");
        }
    }
}
