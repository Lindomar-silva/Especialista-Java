package desafio;

public class Principal {

    public static void main(String[] args) {
        double area = FormasGeometricas.calculaAreaQuadrado(5.5);
        double circulo = FormasGeometricas.calcularAreaCirculo(12.5);

        System.out.printf("Área do quadrado: %.2f%n", area);
        System.out.printf("Área do círculo: %.2f%n", circulo);
    }

}
