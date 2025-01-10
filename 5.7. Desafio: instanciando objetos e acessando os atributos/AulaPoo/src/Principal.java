public class Principal {

    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.nome = "Valente";
        meuCachorro.raca = "Pastor Alemão";
        meuCachorro.sexo = 'M';
        meuCachorro.idade = 7;

        Cachorro seuCachorro = new Cachorro();
        seuCachorro.nome = "Coragem";
        seuCachorro.raca = "Pocial";
        seuCachorro.sexo = 'F';
        seuCachorro.idade = 6;

        System.out.println("Meu Cachorro:");
        System.out.printf("Nome: %s%n", meuCachorro.nome);
        System.out.printf("Raça: %s%n", meuCachorro.raca);
        System.out.printf("Sexo: %s%n", meuCachorro.sexo);
        System.out.printf("Idade %d%n", meuCachorro.idade);

        System.out.println("---------");

        System.out.println("Seu Cachorro:");
        System.out.printf("Nome: %s%n", seuCachorro.nome);
        System.out.printf("Raça: %s%n", seuCachorro.raca);
        System.out.printf("Sexo: %s%n", seuCachorro.sexo);
        System.out.printf("Idade %d%n", seuCachorro.idade);
    }
}