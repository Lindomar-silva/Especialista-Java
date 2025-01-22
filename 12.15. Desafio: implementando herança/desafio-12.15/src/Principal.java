import com.algaworks.Funcionario;
import com.algaworks.Holerite;
import com.algaworks.Programador;

public class Principal {

    public static void main(String[] args) {
        Funcionario delma = new Funcionario("Delma", 40);
        Holerite holeriteDelma = delma.gerarHolerite(180, "Janeiro de 2025");
        System.out.println(delma);
        holeriteDelma.imprimir();

        System.out.println("-------------------------");

        Programador lindomar = new Programador("Lindomar", 80);
        lindomar.setValorBonus(1000);
        Holerite holeriteLindomar = lindomar.gerarHolerite(180, "Dezembro de 2024");
        System.out.println(lindomar);
        holeriteLindomar.imprimir();
    }
}
