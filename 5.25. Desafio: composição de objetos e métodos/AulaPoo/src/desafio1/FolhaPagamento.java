package desafio1;

public class FolhaPagamento {

    double calcularSalario(int horasNormal, int horasExtras, double valorHoraNomal, double valorHoraExtra) {
        double totalHoraNormais = horasNormal * valorHoraNomal;
        double totalHoraExtra = horasExtras * valorHoraExtra;
        return totalHoraNormais + totalHoraExtra;
    }
}
