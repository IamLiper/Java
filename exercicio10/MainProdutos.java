public class MainProdutos {
    public static void main(String[] args) {
        Processador processador1 = new Processador("AMD", "Ryzen", 2.4);
        Memoria memoria1 = new Memoria("Cannabis", "FatalModel", 2.5, 520);
        Placa_Mae placa_Mae1 = new Placa_Mae("ASRock", "micro-ATX", "ATX");
        Dispositivo_De_Armazenamento dispositivo_De_Armazenamento1 = new Dispositivo_De_Armazenamento("Arceus", 520, "SSD", "Energia");

        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
        System.out.println(placa_Mae1.toString());
        System.out.println(dispositivo_De_Armazenamento1.toString());
    }
}
