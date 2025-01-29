import com.algaworks.fiscal.GestorFiscal;
import com.algaworks.fiscal.NotaFiscal;
import com.algaworks.fiscal.NotaFiscalProduto;
import com.algaworks.fiscal.NotaFiscalServico;

public class Princiapl {

    public static void main(String[] args) {
        GestorFiscal gestorFiscal = new GestorFiscal();

        NotaFiscal abstrata = new NotaFiscal("Abstrata", 500);
        NotaFiscalProduto bolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        NotaFiscalServico reparaDaRoda = new NotaFiscalServico("Repara da roda", 1050, true);

        gestorFiscal.emitirNotasFiscais(abstrata, bolaFutebol, reparaDaRoda);

//        System.out.println(bolaFutebol.calcularImpostos());
//        System.out.println(reparaDaRoda.calcularImpostos());

    }
}
