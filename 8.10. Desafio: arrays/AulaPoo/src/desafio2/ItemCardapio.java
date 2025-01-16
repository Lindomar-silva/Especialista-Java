package desafio2;

public class ItemCardapio {

    String descricao;
    double preco;

    boolean possuiPrecoEntre(double minimo, double maximo) {
        return preco >= minimo && preco <= maximo;
    }

    void imprimir() {
        System.out.printf("Descrição: %s - Preço %.2f%n", descricao, preco);
    }
}
