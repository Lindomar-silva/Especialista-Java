package desafio_19_9;

public class NotaFiscal {

//    public static final int STATUS_NAO_EMITIDA = 0;
//    public static final int STATUS_EMITIDA = 1;
//    public static final int STATUS_CANCELADA = 2;

    private final Integer numero;
    private final String descricao;
    private final double valor;
    private StatusNotaFiscal status = StatusNotaFiscal.NAO_EMITIDA;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusNotaFiscal getStatus() {
        return status;
    }

    public void cancelar() {
//        if ((status == STATUS_EMITIDA && getValor() >= 1_000)
//            || status == STATUS_CANCELADA) {
//            throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
//        }

        if (getStatus().podeCancelar(getValor())) {
            status = StatusNotaFiscal.CANCELADA;
        } else {
            throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
        }

    }

    public void emitir() {
//        if (status == STATUS_EMITIDA || status == STATUS_CANCELADA) {
//            throw new IllegalStateException("Não foi possível emitir a nota fiscal");
//        }

        if (getStatus().podeEmitir()) {
            status = StatusNotaFiscal.EMITIDA;
        } else {
            throw new IllegalStateException("Não foi possível emitir a nota fiscal");
        }

    }

    public String getDescricaoCompleta() {
        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
            getNumero(), getDescricao(), getValor(), getStatus().getDescricao());
    }

}