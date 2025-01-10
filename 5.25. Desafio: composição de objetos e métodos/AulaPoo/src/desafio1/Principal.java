package desafio1;

public class Principal {

    public static void main(String[] args) {
        FolhaPagamento pagamento = new FolhaPagamento();

        double salario = pagamento.calcularSalario(240, 80, 25.0, 50.0);
        System.out.printf("Salário devido: %.2f", salario);
    }
}
