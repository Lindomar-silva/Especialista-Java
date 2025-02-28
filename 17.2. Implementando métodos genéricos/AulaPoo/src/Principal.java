import com.algaworks.crm.Cliente;

public class Principal {

    public static void main(String[] args) {
        String[] nomes = {"Maria", "José", "Paulo"};
        String nomeSorteado = Sorteador.sortear(nomes);
        System.out.println(nomeSorteado);

        Cliente[] clientes = {
            new Cliente("Supermercado Page e Leve", 2_000_00),
            new Cliente("Posto Gasolina Boa", 800_000),
            new Cliente("Javac Consultoria", 58_000_000)
        };

        Cliente clienteSorteador = Sorteador.sortear(clientes);
        System.out.println(clienteSorteador.getRazaoSocial());
    }
}
