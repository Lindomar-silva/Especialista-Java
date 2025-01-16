package desafio2;

import java.util.ArrayList;

public class Cardapio {
    ArrayList<ItemCardapio> itens = new ArrayList<>();

    void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    void removerItem(int indice) {
        itens.remove(indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio iten : itens) {
            if (iten.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                iten.imprimir();
            }
        }
    }

}
