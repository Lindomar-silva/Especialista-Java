// 3) Desafio da estrutura while
// Escreva um programa que solicita números inteiros ao usuário de forma contínua e soma todos os números informados.
// O programa deve parar de solicitar mais números e imprimir a soma deles na saída apenas quando o valor total somado for igual ou superior a 100.

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        while (soma < 100) {
            System.out.print("Digite um número inteiro: ");
            soma += entrada.nextInt();
        }

        System.out.printf("A soma dos números digitados é: %d%n", soma);
    }
}
