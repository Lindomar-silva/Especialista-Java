package com.algaworks.comercial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venda {

    private final Cliente cliente;
    private final List<ItemVenda> itens = new ArrayList<>();
    private double valorTotal;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemVenda> getItens() {
        return Collections.unmodifiableList(itens);
//        return new ArrayList<>(itens);
    }

    public void adicionarItem(ItemVenda item) {
        if (excedeLimiteCompra(item)) {
            throw new LimiteCompraExcedidoException(
                String.format("Limite atual: %.2f", cliente.getLimiteCompra()));
        }

        this.valorTotal += item.getValor();
        this.itens.add(item);
    }

    private boolean excedeLimiteCompra(ItemVenda item) {
        return this.valorTotal + item.getValor() > cliente.getLimiteCompra();
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

}
