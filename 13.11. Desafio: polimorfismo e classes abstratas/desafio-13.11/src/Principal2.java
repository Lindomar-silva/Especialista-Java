import com.algaworks.impostos.EmpresaLucroReal;
import com.algaworks.impostos.EmpresaSimples;
import com.algaworks.impostos.GestorDeImpostos;
import com.algaworks.impostos.PessoaFisica;

public class Principal2 {

    public static void main(String[] args) {
        GestorDeImpostos gestorDeImpostos = new GestorDeImpostos();

        PessoaFisica joao = new PessoaFisica("João da Silva", 45_00);
        PessoaFisica maria = new PessoaFisica("Maria Souza", 180_000);

        EmpresaSimples padaria = new EmpresaSimples("Padaria Sonho", 250_000, 160_000);
        EmpresaLucroReal meta = new EmpresaLucroReal("Meta Consultoria", 8_000_000, 6_000_000);

        gestorDeImpostos.adicionar(joao);
        gestorDeImpostos.adicionar(maria);
        gestorDeImpostos.adicionar(padaria);
        gestorDeImpostos.adicionar(meta);

        System.out.printf("Total de impostos: %.2f%n", gestorDeImpostos.getValorTotalImpostos());
    }
}
