import java.util.Scanner;

public class IndiceMassaCorporal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Sexo \"Digite 1 para 'M' ou qualquer número para 'F'\": ");
        char sexo = 'M';

        if (entrada.nextShort() != 1) {
            sexo = 'F';
        }

        System.out.print("Seu peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Sua Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu imc é: %.2f%n", imc);

        if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)) {
            System.out.println("Abaixo do peso");
        } else if ((sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc <= 26.4)) {
            System.out.println("No peso ideal");
        } else if ((sexo == 'F' && imc <= 27.3) || (sexo == 'M' && imc <= 27.8)) {
            System.out.println("Um pouco acima do peso");
        } else if ((sexo == 'F' && imc <= 32.3) || (sexo == 'M' && imc <= 31.1)) {
            System.out.println("Acima do peso ideal");
        } else {
            System.out.println("Obeso");
        }
    }
}
