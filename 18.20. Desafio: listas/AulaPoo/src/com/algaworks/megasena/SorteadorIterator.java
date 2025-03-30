package com.algaworks.megasena;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class SorteadorIterator implements Iterator<Integer> {

    private static final Random RANDOM = new Random();
    private int quantidaddeSorteada;

    @Override
    public boolean hasNext() {
        return quantidaddeSorteada < 6;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Todos os números já foram sorteados!");
        }

        quantidaddeSorteada++;
        return RANDOM.nextInt(60);
    }
}
