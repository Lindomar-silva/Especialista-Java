package Desafio;

import java.util.ArrayList;
import java.util.Objects;

public class CalcularMedia {

    static double media(double numero1, double numero2, double... numerosAdicionais) {
        double soma = numero1 + numero2;
        int quantidadeNumero = numerosAdicionais.length + 2;

        for (double numeroAdcional : numerosAdicionais) {
            soma += numeroAdcional;
        }

        return soma / quantidadeNumero;
    }
}
