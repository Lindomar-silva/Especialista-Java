package com.algaworks.estruturadedados;

import java.util.Arrays;

// DELIMITANDO
//public class Pilha<T extends Produto> {
public class Pilha<T> implements Colecao<T> {

    private T[] itens;

    public Pilha() {
        itens = (T[]) new Object[0];
    }

    public void colocar(T item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    public T retirar() {
        if (itens.length == 0) {
            throw new ColecaoVazuaException("Pilha sem itens!");
        }

        T item = itens[itens.length - 1];
        itens = Arrays.copyOf(itens, itens.length - 1);

        return item;
    }
}
