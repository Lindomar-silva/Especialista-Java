package com.algaworks.agencia;

import com.algaworks.exception.HotelJaCadastradoException;
import com.algaworks.exception.HotelNaoEncontradoException;

import java.util.ArrayList;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) {
            throw new HotelJaCadastradoException("Hotel já adicionado!");
        }

        hoteis.add(hotel);
    }

    public ArrayList<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String cidade) {

        ArrayList<Hotel> hoteisParaRemocao = new ArrayList<>();

        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            if (hotel.getCidade().equals(cidade)) {
                hoteisParaRemocao.add(hotel);
            }
        }

        hoteis.removeAll(hoteisParaRemocao);
    }

    public void remover(Hotel hotel) {
        boolean removed = hoteis.remove(hotel);

        if (!removed) {
            throw new HotelNaoEncontradoException("Hotel não encontrado para remoção!");
        }
    }

    public void removerTodos() {
        hoteis.clear();
    }

}
