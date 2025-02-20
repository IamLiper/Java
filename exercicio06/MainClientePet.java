package exercicio06;

public class MainClientePet {
    public static void main(String[] args) {
        Pet pet = new Pet("Ralph", "11", "Bull Dog");
        Cliente cliente = new Cliente("Lipe", "18", pet);

        System.out.println(cliente.toString());
    }
}
