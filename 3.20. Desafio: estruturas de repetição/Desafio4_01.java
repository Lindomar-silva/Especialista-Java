import java.util.Scanner;

public class InverterDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int numeroInvertido = 0;

        // Enquanto o número for maior que 0, executa o loop
        while (numero != 0) {
            // Obtém o último dígito do número
            int digito = numero % 10;
            System.out.println("Obtém o último dígito do número: " + digito);

            // Constrói o número invertido
            numeroInvertido = numeroInvertido * 10 + digito;
            System.out.println("Constrói o número invertido: " + numeroInvertido);

            // Remove o último dígito do número original
            System.out.println("Remove o último dígito do número original: " + numero);
            numero = numero / 10;
        }

        // Exibe o número invertido
        System.out.println("Número invertido: " + numeroInvertido);

        scanner.close();
    }
}
