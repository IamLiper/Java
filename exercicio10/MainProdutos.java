public class MainProdutos {
    public static void main(String[] args) {
        Processador processador1 = new Processador("AMD", "Ryzen", 2.4);
        Memoria memoria1 = new Memoria("Cannabis", "FatalModel", 2.5, 520);

        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
    }
}
