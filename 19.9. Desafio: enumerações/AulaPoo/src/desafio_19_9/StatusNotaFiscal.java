package desafio_19_9;

public enum StatusNotaFiscal {

    NAO_EMITIDA("Não Emitida") {
        @Override
        public boolean podeCancelar(double valor) {
            return true;
        }

        @Override
        public boolean podeEmitir() {
            return true;
        }
    },

    EMITIDA("Emitida") {
        @Override
        public boolean podeCancelar(double valor) {
            return valor < 1_000;
        }

        @Override
        public boolean podeEmitir() {
            return false;
        }
    },

    CANCELADA("Cancelada") {
        @Override
        public boolean podeCancelar(double valor) {
            return false;
        }

        @Override
        public boolean podeEmitir() {
            return false;
        }
    };

    private final String descricao;

    StatusNotaFiscal(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract boolean podeCancelar(double valor);

    public abstract boolean podeEmitir();
}
