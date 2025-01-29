import com.algaworks.impostos.GestorDeImpostos;
import com.algaworks.impostos.PessoaFisica;

public class Princiapl1 {

    public static void main(String[] args) {
        GestorDeImpostos gestorDeImpostos = new GestorDeImpostos();

        PessoaFisica joao = new PessoaFisica("João da Silva", 45_00);
        PessoaFisica maria = new PessoaFisica("Maria Souza", 180_000);

        gestorDeImpostos.adicionar(joao);
        gestorDeImpostos.adicionar(maria);

        System.out.printf("Total de impostos: %.2f%n", gestorDeImpostos.getValorTotalImpostos());
    }
}
