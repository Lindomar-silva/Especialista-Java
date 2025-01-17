package Desafio;

public class Principal {

    public static void main(String[] args) {
        imprimirUsoMemoria();

//        byte[] w = new byte[500 * 1024 * 1024];
        byte[] x = new byte[500 * 1024 * 1024];
        byte[] y = new byte[500 * 1024 * 1024];
        byte[] z = new byte[500 * 1024 * 1024];

        imprimirUsoMemoria();
    }

    static void imprimirUsoMemoria() {
        System.out.printf("Máxima: %s%n", emMegaBytes(Runtime.getRuntime().maxMemory()));
        System.out.printf("Total empenhada: %s%n", emMegaBytes(Runtime.getRuntime().totalMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.printf("Usada: %s%n", emMegaBytes(memoriaUsada));

        System.out.printf("Disponível: %s%n", emMegaBytes(Runtime.getRuntime().freeMemory()));

        System.out.println("------------");
    }

    static String emMegaBytes(long bytes) {
        return String.format("%.2f MB", bytes / 1024d / 1024d);
    }
}
