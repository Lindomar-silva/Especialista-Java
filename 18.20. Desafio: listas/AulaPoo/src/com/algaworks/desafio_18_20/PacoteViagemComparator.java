package com.algaworks.desafio_18_20;

import java.util.Comparator;

public class PacoteViagemComparator implements Comparator<PacoteViagem> {

    @Override
    public int compare(PacoteViagem o1, PacoteViagem o2) {
        return Double.compare(o1.getPrecoPorPessoa(), o2.getPrecoPorPessoa());
    }
}
