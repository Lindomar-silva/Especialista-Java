import com.algaworks.crm.Contato;
import com.algaworks.crm.IdadeContatoComparetor;

import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {
        Set<Contato> contatos = new TreeSet<>(new IdadeContatoComparetor());

        System.out.println("---------");
        contatos.add(new Contato("Maria", "maria@algaworks.com", 40));
        contatos.add(new Contato("Ana", "ana@algaworks.com", 30));
        contatos.add(new Contato("José", "jose@algaworks.com", 25));
        contatos.add(new Contato("Rosa", "rosa@algaworks.com", 50));
        contatos.add(new Contato("João", "joao@algaworks.com", 70));
        System.out.println("---------");

//        contatos.add(null);
        contatos.add(new Contato("Ana Silva", "ana@alagaworks.com", 10));
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}
