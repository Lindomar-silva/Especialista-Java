package com.algaworks.detran;

import java.util.Objects;

public class Proprietario {

    private String nome;
    private String cpf;

    public Proprietario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Proprietario{" +
            "nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            '}';
    }
}
