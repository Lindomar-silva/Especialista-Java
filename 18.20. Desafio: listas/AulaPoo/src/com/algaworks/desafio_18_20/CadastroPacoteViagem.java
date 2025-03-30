package com.algaworks.desafio_18_20;

import com.algaworks.desafio_18_20.exception.ViagemJaCadastraException;
import com.algaworks.desafio_18_20.exception.ViagemNaoEncontradaException;

import java.util.*;

public class CadastroPacoteViagem {

    //    private List<PacoteViagem> viagems = new ArrayList<>();
    private List<PacoteViagem> pacotes = new LinkedList<>();

    public void adicionar(String descricao, double precoDiaria) {
        PacoteViagem viagem = new PacoteViagem(descricao, precoDiaria);

        if (pacotes.contains(viagem)) {
            throw new ViagemJaCadastraException("Pacote de viagem com esta descrição já está adicionada!");
        }

        pacotes.add(viagem);
    }

    public List<PacoteViagem> obterTodos() {
        return pacotes;
    }

    public void ordenar() {
        Collections.sort(pacotes);
    }

    public void ordenarPorPrecoDecrescente() {
        pacotes.sort(new PacoteViagemComparator().reversed());
    }

    public void removerPorDescricao(String descricao) {
        boolean removido = false;
        Iterator<PacoteViagem> viagemIterator = pacotes.iterator();

        while (viagemIterator.hasNext()) {
            PacoteViagem viagem = viagemIterator.next();

            if (viagem.getDescricao().equals(descricao)) {
                viagemIterator.remove();
                removido = true;
            }
        }

        if (!removido) {
            throw new ViagemNaoEncontradaException("Nenhuma viagem foi encontrada!");
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for (PacoteViagem pacote : pacotes) {
            if (pacote.getDescricao().equals(descricao)) {
                return pacote;
            }
        }

        throw new ViagemNaoEncontradaException("Viagem não encontrada!");
    }

}