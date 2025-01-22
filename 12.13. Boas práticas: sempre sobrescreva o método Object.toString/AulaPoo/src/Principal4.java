import com.algaworks.banco.Conta;
import com.algaworks.banco.Titular;

public class Principal4 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "21234123456");
        Conta conta = new Conta(titular, 1234, 123456);

        System.out.println(conta);

    }
}
