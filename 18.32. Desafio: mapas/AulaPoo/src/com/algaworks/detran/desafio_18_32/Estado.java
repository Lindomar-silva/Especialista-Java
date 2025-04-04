package com.algaworks.detran.desafio_18_32;

import java.util.Objects;

public class Estado implements Comparable<Estado> {

    private String sigla;
    private String nome;

    public Estado(String sigla, String nome) {
        Objects.requireNonNull(sigla);
        Objects.requireNonNull(nome);
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return Objects.equals(sigla, estado.sigla);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(sigla);
    }

    @Override
    public String toString() {
        return "Estado{" +
            "sigla='" + sigla + '\'' +
            ", nome='" + nome + '\'' +
            '}';
    }

    @Override
    public int compareTo(Estado o) {
        return getSigla().compareTo(o.getSigla());
    }
}
