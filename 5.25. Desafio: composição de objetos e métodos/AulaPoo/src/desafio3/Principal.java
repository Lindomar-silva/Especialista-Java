package desafio3;


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

        Holerite holerite = pagamento.calcularSalario(220, 40, contrato);
        holerite.imprimir();
    }
}
