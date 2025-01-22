import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titualar;

public class Principal3 {

    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial();
        conta1.setTitualar(new Titualar("João da Silva", "123456789123"));
        conta1.setAgencia(1234);
        conta1.setNumero(123456);
        conta1.setLimiteChequeEspecial(1000);
        conta1.setTarifaMensal(90);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(200);
        conta1.imprimirDemonstrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();
    }
}
