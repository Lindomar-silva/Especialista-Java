import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.Titualar;

public class Principal1 {

    public static void main(String[] args) {
        ContaInvestimento conta1 = new ContaInvestimento();
        conta1.setTitualar(new Titualar("João da Silva", "123456789123"));
        conta1.setAgencia(1234);
        conta1.setNumero(123456);

        conta1.imprimirDemonstrativo();
        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(25.7);
        conta1.imprimirDemonstrativo();
    }
}
