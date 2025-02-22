package atividade_1;

public class MainProcMem {
    public static void main(String[] args) {
        Processador processador = new Processador("Shavallo", "silver", "2Ghz");
        Memoria memoria = new Memoria("Terra", "Djei", "22gb");

        System.out.println(processador.toString());
        System.out.println();
        System.out.println(memoria.toString());
        System.out.println();
    }
}
