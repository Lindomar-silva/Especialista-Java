import com.algaworks.banco.*;

public class Princiapl {

    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        Titular titular = new Titular("João da Silva", "12345678912");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 123456, 90);
        contaEspecial.setLimiteChequeEspecial(1000);

        Titular titular1 = new Titular("João da Silva", "12345678912");
        ContaInvestimento contaInvestimento = new ContaInvestimento(titular1, 1234, 123456);

        contaInvestimento.depositar(100);
        contaInvestimento.creditarRendiemntos(10);

        Titular titular2 = new Titular("João da Silva", "12345678912");
        ContaSalario contaSalario = new ContaSalario(titular2, 1234, 123456, 18_000);

//        caixaEletronico.imprimirDemonstrativo(contaInvestimento);
//        caixaEletronico.imprimirDemonstrativo(contaEspecial);

        contaSalario.depositar(100);
        caixaEletronico.imprimirDemonstrativo(contaSalario);

    }
}
