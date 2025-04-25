public enum StatusPedido {

    RASCUNHO,
    EMITIDO(12),
    FATURADO(10),
    SEPARADO(8),
    DESPACHADO(6),
    ENTREGUE(0),
    CANCELADO;

    private int tempoEntregaEmhoras;

    StatusPedido() {
    }

    StatusPedido(int tempoEntregaEmhoras) {
        this.tempoEntregaEmhoras = tempoEntregaEmhoras;
    }

    public int getTempoEntregaEmhoras() {
        return tempoEntregaEmhoras;
    }
}
