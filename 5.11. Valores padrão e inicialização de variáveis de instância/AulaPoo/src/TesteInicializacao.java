import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TesteInicializacao {

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.fabrincante = "GM";
        carro.anoFabricacao = 2024;
        
        System.out.println(carro.fabrincante);
        System.out.println(carro.modelo);
        System.out.println(carro.anoFabricacao);
    }
}
