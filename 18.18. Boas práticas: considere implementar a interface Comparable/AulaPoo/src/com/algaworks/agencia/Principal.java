package com.algaworks.agencia;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Hotel 5 Estrela", "Londrina", 58.99);
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);

//        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

        cadastro.ordenar();
        List<Hotel> hoteis = cadastro.obterTodos();
//        System.out.println(hoteis.lastIndexOf(new Hotel("Mercure", "Uberlândia/MG", 400)));
        imprimirHoteis(hoteis);

//        cadastro.remover(new Hotel("Vila Selvagem", "Fortim/CE", 1400));
//        cadastro.removerPorCidade("Fortim/CE");

//        cadastro.removerTodos();
//        imprimirHoteis(hoteis);

    }

    private static void imprimirHoteis(List<Hotel> hoteis) {
        for (Hotel hotel : hoteis) {
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }
}
