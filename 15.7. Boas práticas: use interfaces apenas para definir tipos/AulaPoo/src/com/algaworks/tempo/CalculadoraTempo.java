package com.algaworks.tempo;

public class CalculadoraTempo {

    public static double converterSegundosEmHoras(int segundos) {
        return (double) segundos / TempoContstants.SEGUNDOS_POR_HORA;
    }

    public static double converterSegundosEmMinutos(int segundos) {
        return (double) segundos / TempoContstants.SEGUNDOS_POR_MINUTOS;
    }
}
