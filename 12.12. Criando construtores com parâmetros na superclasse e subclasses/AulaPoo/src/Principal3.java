import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titular;

public class Principal3 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "123456789123");
        ContaEspecial conta1 = new ContaEspecial(titular, 1234, 123456, 90);

        conta1.setLimiteChequeEspecial(1000);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(200);
        conta1.imprimirDemonstrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();
    }
}
