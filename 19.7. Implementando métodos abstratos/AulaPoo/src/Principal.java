public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
//        pedido.emitir();
        pedido.setStatus(StatusPedido.EM_ANALISE);
        pedido.setValorTotal(900);
        pedido.cancelar();

        System.out.println(pedido.getTempoEntregaEmhoras());
        System.out.println(pedido.getStatus());

    }

}