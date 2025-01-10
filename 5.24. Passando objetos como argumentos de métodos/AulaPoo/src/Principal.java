public class Principal {

    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();

        Paciente lindomar = new Paciente();
        lindomar.altura = 1.67;
        lindomar.peso = 84;

        IndiceMassaCorporal imc = calculadoraImc.calcular(lindomar);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                "está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}