package exercicio06;

public class MainRelacionamento {
    public static void main(String[] args) {

        // Versão1
        Endereco endereco = new Endereco("Rua Doutor Alberto Lima Braga", "3", "Salvador");
        Cliente cliente = new Cliente("Lipe", "18", endereco);
        
        System.out.println(cliente.toString());

        // Versão2
        Cliente cliente2 = new Cliente("Lipe", "33",
        new Endereco("Rua A", "55", "SP"));

        System.out.println(cliente2.toString());
    }
}