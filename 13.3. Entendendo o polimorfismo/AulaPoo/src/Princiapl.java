import com.algaworks.banco.CaixaEletronico;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titular;
import com.algaworks.banco.ContaSalario;

public class Princiapl {

    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        Titular titular1 = new Titular("João da Silva", "12345678912");
        ContaEspecial contaEspecial1 = new ContaEspecial(titular1, 1234, 123456, 90);
        contaEspecial1.setLimiteChequeEspecial(1000);

        Titular titular2 = new Titular("Maria Gabriela", "98765432132");
        ContaEspecial contaEspecial2 = new ContaEspecial(titular2, 4321, 654321, 90);

        Titular titular3 = new Titular("Francisco Paulo", "85265478965");
        ContaSalario contaSalario = new ContaSalario(titular3, 8523, 658523, 18_000);

        contaSalario.depositar(300);

        caixaEletronico.transferir(contaEspecial1, contaSalario, 50);
        contaEspecial1.imprimirDemonstrativo();
        contaSalario.imprimirDemonstrativo();
    }
}
