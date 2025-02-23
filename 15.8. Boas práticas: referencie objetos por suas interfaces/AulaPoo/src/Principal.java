import com.algaworks.loja.Carrinho;
import com.algaworks.loja.ItemCarrinho;
import com.algaworks.loja.pagamento.CartaoCredito;
import com.algaworks.loja.pagamento.MetodoPagamento;
import com.algaworks.loja.pagamento.Transferencia;

public class Principal {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        carrinho.adicionarItem(new ItemCarrinho("AirPods", 2000));
        carrinho.adicionarItem(new ItemCarrinho("Apple Watgh", 5100));
        carrinho.adicionarItem(new ItemCarrinho("Magic Moude", 600));

//        MetodoPagamento metodoPagamento = new CartaoCredito("123123123");
        MetodoPagamento metodoPagamento = new Transferencia("9999", "99956658");
        carrinho.finalizar(metodoPagamento);
    }
}
