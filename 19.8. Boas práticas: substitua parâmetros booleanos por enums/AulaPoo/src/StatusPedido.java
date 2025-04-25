public enum StatusPedido {

    RASCUNHO {
        @Override
        public boolean podeCancelarPedido(double valorPedido) {
            return true;
        }
    },
    EMITIDO(12) {
        @Override
        public boolean podeCancelarPedido(double valorPedido) {
            return valorPedido < 100;
        }
    },
    EM_ANALISE(11) {
        @Override
        public boolean podeCancelarPedido(double valorPedido) {
            return valorPedido < 100;
        }
    },
    FATURADO(10) {
        @Override
        public boolean podeCancelarPedido(double valorPedido) {
            return false;
        }
    },
    SEPARADO(8) {
        @Override
        public boolean podeCancelarPedido(double valorPedido) {
            return false;
        }
    },
    DESPACHADO(6) {
        @Override
        public boolean podeCancelarPedido(double valorPedido) {
            return false;
        }
    },
    ENTREGUE(0) {
        @Override
        public boolean podeCancelarPedido(double valorPedido) {
            return false;
        }
    },
    CANCELADO {
        @Override
        public boolean podeCancelarPedido(double valorPedido) {
            return false;
        }
    };

    private int tempoEntregaEmhoras;

    StatusPedido() {
    }

    StatusPedido(int tempoEntregaEmhoras) {
        this.tempoEntregaEmhoras = tempoEntregaEmhoras;
    }

    public int getTempoEntregaEmhoras() {
        return tempoEntregaEmhoras;
    }

    public abstract boolean podeCancelarPedido(double valorPedido);
//    public boolean podeCancelarPedido(double valor) {
//        return StatusPedido.RASCUNHO.equals(this)
//            || (StatusPedido.EMITIDO.equals(this) && valor < 100);
//    }
}
