import com.algaworks.banco.Conta;
import com.algaworks.banco.Titualar;

public class Principal2 {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitualar(new Titualar("João da Silva", "123456789123"));
        conta1.setAgencia(1234);
        conta1.setNumero(123456);
        conta1.setTipo(Conta.INVESTIMENTO);

        conta1.imprimirDemonstrativo();
        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.creditarRendiemntos(6);
        conta1.imprimirDemonstrativo();
    }
}
