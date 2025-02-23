package com.algaworks.financeira.modelo;

public interface PessoBonificavel extends ClienteFinanciavel {

    double calcularBonus(double percentualMetaAlcancada);
}
