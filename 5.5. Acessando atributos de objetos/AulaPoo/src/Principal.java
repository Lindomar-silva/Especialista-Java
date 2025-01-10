public class Principal {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2013;
        meuCarro.cor="Branco";
        meuCarro.fabrincante="GM";
        meuCarro.modelo="Agile";

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 1990;
        seuCarro.cor="Preto";
        seuCarro.fabrincante="GM";
        seuCarro.modelo="Diplomata";

        System.out.println("Meu carro");
        System.out.println("---------");
        System.out.printf("Modelo %s%n", meuCarro.modelo);
        System.out.printf("Ano %d%n", meuCarro.anoFabricacao);

        System.out.println();

        System.out.println("Seu carro");
        System.out.println("---------");
        System.out.printf("Modelo %s%n", seuCarro.modelo);
        System.out.printf("Ano %d%n", seuCarro.anoFabricacao);
    }
}