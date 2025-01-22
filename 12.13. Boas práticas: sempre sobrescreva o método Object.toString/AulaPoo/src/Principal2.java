import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "123456789123");
        ContaInvestimento conta1 = new ContaInvestimento(titular, 1234, 123456);

        conta1.imprimirDemonstrativo();
        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.creditarRendiemntos(6);
        conta1.imprimirDemonstrativo();

        System.out.println(conta1);
    }
}
