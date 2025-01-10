public class TesteInicializacao {

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.fabrincante = "GM";
        carro.anoFabricacao = 2024;
        carro.proprietario.nome = "Maria José";
        
        Pessoa proprietarioAntigo = carro.proprietario;

        carro.proprietario = new Pessoa();

        System.out.println(carro.fabrincante);
        System.out.println(carro.modelo);
        System.out.println(carro.anoFabricacao);
        System.out.println(carro.proprietario.nome);
    }
}
