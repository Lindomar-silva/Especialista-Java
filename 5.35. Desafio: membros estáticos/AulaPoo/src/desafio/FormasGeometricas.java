package desafio;

public class FormasGeometricas {
    static final double PI = 3.14159265358979323846;

    public static double calculaAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaCirculo(double raio) {
        return calculaAreaQuadrado(raio) * FormasGeometricas.PI;
    }
}
