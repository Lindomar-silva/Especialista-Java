package desafio;

public class NumeroUtil {

    static int maiorNumero(int numero1, int numero2) {
        return numero1 > numero2 ? numero1 : numero2;
    }

    static int maiorNumero(int numero1, int numero2, int numero3) {
        return maiorNumero(maiorNumero(numero1, numero2), numero3);
    }

    static double maiorNumero(double numero1, double numero2) {
        return numero1 > numero2 ? numero1 : numero2;
    }

    static double maiorNumero(double numero1, double numero2, double numero3) {
        return maiorNumero(maiorNumero(numero1, numero2), numero3);
    }

}
