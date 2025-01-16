package desafio2;

import java.util.Arrays;

public class Cardapio {
    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    void removerItem(int indice) {
        // Criando um novo array com tamanho reduzido
        ItemCardapio[] novoItens = new ItemCardapio[itens.length - 1];

        // Copia os elementos até o índice desejado
        System.arraycopy(itens, 0, novoItens, 0, indice);

        // Copia os elementos depois do índice removido
        System.arraycopy(itens, indice + 1, novoItens, indice, novoItens.length - indice);

        itens = novoItens;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio iten : itens) {
            if (iten.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                iten.imprimir();
            }
        }
    }

}
