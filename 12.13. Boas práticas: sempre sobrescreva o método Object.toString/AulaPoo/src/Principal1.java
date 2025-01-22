import com.algaworks.banco.Conta;
import com.algaworks.banco.Titular;

public class Principal1 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "123456789123");
        Conta conta1 = new Conta(titular, 1234, 123456);

        conta1.imprimirDemonstrativo();
        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(25.7);
        conta1.imprimirDemonstrativo();
    }
}
