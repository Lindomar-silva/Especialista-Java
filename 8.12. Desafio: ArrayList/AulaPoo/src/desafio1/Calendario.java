package desafio1;

public class Calendario {

    static final String[] MES = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    static String obterNomeMes(int numeroMes) {

        if (numeroMes < 1 || numeroMes < 12) {
            return null;
        }

        return MES[numeroMes - 1];
    }
}

