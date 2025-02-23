import com.algaworks.contaspagar.modelo.Holerite;
import com.algaworks.contaspagar.modelo.OrdemServico;
import com.algaworks.contaspagar.servico.ServicoContaPagar;
import com.algaworks.pagamento.Beneficiario;
import com.algaworks.pagamento.DocumentoPagavel;

public class Principal {

    public static void main(String[] args) {

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        Beneficiario funcionario = new Beneficiario("João da Silva", "123456789123", "123456");
        Holerite holerite = new Holerite(funcionario, 100, 168);

        Beneficiario fornecedor = new Beneficiario("Consultaria XYZ", "321854678558", "852456");
        OrdemServico ordemServico = new OrdemServico(fornecedor, 65_500);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(ordemServico);
    }
}
