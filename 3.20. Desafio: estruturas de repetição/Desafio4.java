// 4) Desafio da estrutura while (intermediário)
// Escreva um programa que solicita um número inteiro para o usuário e imprime na saída o número com os dígitos invertidos.
// Por exemplo, se o número digitador for 98765, a saída deve ser 56789.
// Este é um exercício intermediário, especialmente porque precisará usar suas habilidades em lógica. É possível fazer isso apenas com um loop e cálculos matemáticos.

import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numeroOriginal = entrada.nextInt();
        int numeroAInverter = numeroOriginal;
        int numeroInvertido = 0;

        while (numeroAInverter > 0) {
            numeroInvertido *= 10;
            numeroInvertido += (numeroAInverter % 10);
            numeroAInverter /= 10;
        }

        System.out.printf("Número invertido de %d é: %d%n", numeroOriginal, numeroInvertido);
    }
}
