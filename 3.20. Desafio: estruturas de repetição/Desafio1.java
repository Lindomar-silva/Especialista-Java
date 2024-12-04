// 1) Desafio da estrutura for
// Escreva um programa que solicita 10 números para o usuário e imprime na saída a soma dos números digitados.
// Permita que o usuário digite apenas números pares. Caso um número ímpar seja informado, ignore e solicite um novo número ao usuário.

import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número par: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                soma += numero;
            } else {
                System.out.println("O número digitado não é um número par");
                i--;
            }
        }

        System.out.printf("Soma dos números digitados: %d%n ", soma);

    }
}
