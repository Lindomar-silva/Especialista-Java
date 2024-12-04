import java.util.Scanner;

public class SomaNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int contador = 0;

        System.out.println("Digite 10 números pares:");

        while (contador < 10) {
            System.out.print("Digite o " + (contador + 1) + "º número: ");
            try {
                int numero = scanner.nextInt();
                if (numero % 2 == 0) { // Verifica se o número é par
                    soma += numero;
                    contador++;
                } else {
                    System.out.println("Número ímpar informado. Por favor, digite um número par.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
            }
        }

        System.out.println("A soma dos 10 números pares digitados é: " + soma);
        scanner.close();
    }
}
