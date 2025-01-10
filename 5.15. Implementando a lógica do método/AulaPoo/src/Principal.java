public class Principal {

    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Lindomar";
        eu.cpf = "190.168.381-98";
        eu.anoNascimento = 1977;

        Pessoa voce = new Pessoa();
        voce.nome = "Vinícius";
        voce.cpf = "190.168.381-98";
        voce.anoNascimento = 1977;


        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2013;
        meuCarro.cor = "Branco";
        meuCarro.fabrincante = "GM";
        meuCarro.modelo = "Agile";
        meuCarro.precoCompra = 120000;
        meuCarro.proprietario = eu;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 1990;
        seuCarro.cor = "Preto";
        seuCarro.fabrincante = "GM";
        seuCarro.modelo = "Diplomata";
        seuCarro.precoCompra = 980000;
        seuCarro.proprietario = voce;

        meuCarro.calcularValorRevenda();
        seuCarro.calcularValorRevenda();

//        System.out.println("Meu carro");
//        System.out.println("---------");
//        System.out.printf("Modelo %s%n", meuCarro.modelo);
//        System.out.printf("Ano %d%n", meuCarro.anoFabricacao);
//        System.out.printf("Proprietário %s%n", meuCarro.proprietario.nome);
//
//        System.out.println();
//
//        System.out.println("Seu carro");
//        System.out.println("---------");
//        System.out.printf("Modelo %s%n", seuCarro.modelo);
//        System.out.printf("Ano %d%n", seuCarro.anoFabricacao);
//        System.out.printf("Proprietário %s%n", seuCarro.proprietario.nome);
    }
}