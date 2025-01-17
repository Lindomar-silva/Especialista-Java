package Desafio;

public class Principal {

    public static void main(String[] args) {

        Participante participanteA = new Participante("José");
        Participante participanteB = new Participante("Maria", 10000);

        System.out.printf("Particpante: %s, saldo: %d%n", participanteA.nome, participanteA.saldoDePontos);
        System.out.printf("Particpante: %s, saldo: %d%n", participanteB.nome, participanteB.saldoDePontos);
    }
}
