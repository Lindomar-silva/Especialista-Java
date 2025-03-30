import hashcode.Contato;

public class Principal {

    public static void main(String[] args) {

        Contato contato1 = new Contato("Maria", "maria@algaworks.com", 40);
        Contato contato2 = new Contato("José", "jose@algaworks.com", 35);
        Contato contato3 = new Contato("João", "joao@algaworks.com", 20);
        Contato contato4 = new Contato("João da Silva", "joao@algaworks.com", 20);

        System.out.println(contato1.hashCode());
        System.out.println(contato2.hashCode());
        System.out.println(contato3.hashCode());
        System.out.println(contato4.hashCode());
    }
}
