public class Pedido {

    public static final int ORIGEM_BALCAO = 100;
    public static final int ORIGEM_ONLINE = 101;

    private String nomeCliente;
    private StatusPedido status = StatusPedido.RASCUNHO;
    private OrigemPedido origem = OrigemPedido.BALCAO;
    private double valorTotal;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }

    public int getTempoEntregaEmhoras() {
        return status.getTempoEntregaEmhoras();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void entregar() {
        setStatus(StatusPedido.ENTREGUE);
    }

    public void emitir() {
        setStatus(StatusPedido.EMITIDO);
    }

    public void cancelar() {
        if (getStatus().podeCancelarPedido(getValorTotal())) {
            setStatus(StatusPedido.CANCELADO);
        } else {
            throw new IllegalArgumentException("Pedido não pode ser cancelado!");
        }
    }
}