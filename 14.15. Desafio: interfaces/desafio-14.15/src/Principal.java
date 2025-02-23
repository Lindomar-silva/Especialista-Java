import com.algaworks.seguros.modelo.Caminhão;
import com.algaworks.seguros.modelo.CarroParticular;
import com.algaworks.seguros.modelo.ImovelResidencial;
import com.algaworks.seguros.servico.ServicoPropostaSeguro;

public class Principal {

    public static void main(String[] args) {

        CarroParticular carroParticular = new CarroParticular("HR V", 150_000, 2025);
        Caminhão caminhao = new Caminhão("Actros", 780_000, 2021, 4);
        ImovelResidencial imovelResidencial = new ImovelResidencial(2_300_000, 320);

        ServicoPropostaSeguro servico = new ServicoPropostaSeguro();

        servico.emitir(imovelResidencial);
        servico.emitir(carroParticular);
        servico.emitir(caminhao);
    }
}
