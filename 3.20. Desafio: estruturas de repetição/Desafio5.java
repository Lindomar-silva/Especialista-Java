// 5) Desafio da estrutura do-while
// Escreva um programa que solicita números inteiros para o usuário de forma "infinita", até que o usuário escolha não digitar mais nenhum número (pergunte ao usuário após informar cada número).
// Some todos os números ímpares e todos os números pares e imprima na saída o resultado.

import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int somaPares = 0;
        int somaImmpares = 0;
        boolean continuar = true;

        do {
            System.out.print("Digite um número intero: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                somaImmpares += numero;
            }

            System.out.print("Deseja continuar: ");
            continuar = entrada.nextBoolean();

        } while(continuar);

        System.out.printf("Soma dos número Pares: %d%n", somaPares);
        System.out.printf("Soma dos número Impares: %d%n", somaImmpares);
    }
}
