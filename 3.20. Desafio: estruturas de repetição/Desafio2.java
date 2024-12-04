// 2) Desafio da estrutura for (intermediário)
// Escreva um programa que solicita um número inteiro positivo para o usuário e imprime na saída uma mensagem dizendo se o número digitado é um número primo ou não.
// Números primos são números naturais que possuem dois divisores: 1 e ele mesmo.
// Por exemplo, o número 1 não é um número primo, porque ele tem apenas o número 1 (ele mesmo) como divisor. O número 2 é primo, porque ele é divisível por 1 e ele mesmo.
// O número 4 não é primo, porque ele é divisível por 1, 2 e 4.
// Para saber se um número é divisível por outro, basta usar o operador de módulo (resto) e avaliar se é igual a 0.

import java.util.Scanner;

public class Desafio2 {

   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = entrada.nextInt();
        boolean numeroPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                numeroPrimo = false;
                break;
            }
        }

        if (numeroPrimo && numero > 1) {
            System.out.printf("%d é um número primo%n", numero);
        } else {
          System.out.printf("%d não é um número primo%n", numero);
        }
    }
}
