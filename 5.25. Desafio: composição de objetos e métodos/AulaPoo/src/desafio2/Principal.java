package desafio2;

public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Lindomar";
        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.funcionario = funcionario;
        contrato.valorHoraNormal = 25.0;
        contrato.valorHoraExtra = 50.0;

        FolhaPagamento pagamento = new FolhaPagamento();

        double salario = pagamento.calcularSalario(220, 40, contrato);

        System.out.printf("Salário devido: %.2f%n", salario);

    }
}
