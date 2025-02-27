import com.algaworks.crm.Cliente;
import com.algaworks.crm.Funcionario;
import com.algaworks.crm.Pesquisador;

public class Principal {

    public static void main(String[] args) {
        Funcionario[] funcionarios = {
            new Funcionario("João", 40),
            new Funcionario("José", 20),
            new Funcionario("Maria", 30)
        };

        Cliente[] clientes = {
            new Cliente("Supermercado Page e Leve", 2_000_00),
            new Cliente("Posto Gasolina Boa", 800_000),
            new Cliente("Javac Consultoria", 58_000_000)
        };

        Funcionario funcionarioEncontrado = Pesquisador.obterPorNome(funcionarios, "João");
        System.out.println(funcionarioEncontrado);

        Cliente clienteEncontrado = Pesquisador.obterPorNome(clientes, "Javac Consultoria");
        System.out.println(clienteEncontrado);
    }
}
