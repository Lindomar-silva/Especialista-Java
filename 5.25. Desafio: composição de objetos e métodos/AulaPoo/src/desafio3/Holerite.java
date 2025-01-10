package desafio3;

public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalFilhos;

    double calcularValor() {
        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdicionalFilhos;
    }

    void imprimir() {
        System.out.println("------------- HOLERITE -------------");
        System.out.printf("Funcionário: %s%n", funcionario.nome);
        System.out.printf("Total horas normais: %.2f%n", valorTotalHorasNormais);
        System.out.printf("Total horas extras: %.2f%n", valorTotalHorasExtras);
        System.out.printf("Valor adicional Filhos %.2f%n", valorAdicionalFilhos);
        System.out.printf("Toal devido a receber: %.2f%n", calcularValor());
    }
}
