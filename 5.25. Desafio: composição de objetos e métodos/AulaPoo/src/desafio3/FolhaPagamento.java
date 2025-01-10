package desafio3;


public class FolhaPagamento {

    Holerite calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho contrato) {
        Holerite holerite = new Holerite();
        holerite.funcionario = contrato.funcionario;
        holerite.valorTotalHorasNormais = horasNormais * contrato.valorHoraNormal;
        holerite.valorTotalHorasExtras = horasExtras * contrato.valorHoraExtra;

        double salario = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;

        if (contrato.possuiAdicionalParaFilhos()) {
            holerite.valorAdicionalFilhos = (salario * 10) / 100;
//            holerite.valorAdicionalFilhos = salario * 0.10;
        }

        return holerite;
    }
}