public class Produto {

    String nome;
    double precoUnitario;
    boolean ativo;

    boolean ativar() {
        System.out.println("Ativo");
        return true;
    }

    boolean inativar() {
        System.out.println("Inativo");
        return false;
    }
}
