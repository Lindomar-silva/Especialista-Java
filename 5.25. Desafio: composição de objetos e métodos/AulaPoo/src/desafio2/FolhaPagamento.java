package desafio2;

public class FolhaPagamento {

    double calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho contrato) {
        double valorHoraNormais = horasNormais * contrato.valorHoraNormal;
        double valorHoraExtra = horasExtras * contrato.valorHoraExtra;

        double salario = valorHoraNormais + valorHoraExtra;

        if (contrato.possuiAdicionalParaFilhos()) {
            salario += (salario * 10) / 100;
//            salario *= 1.10;
        }
        return salario;
    }
}