package exemplo;

public class MainExemplo {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Lipe", 18, "17/02/2023", "PIX");
        Funcionario funcionario1 = new Funcionario("Lucas", 22, "22.1145", "Gerente", "12000");

        System.out.println();
        System.out.println(cliente1.toString());
        System.out.println();
        System.out.println(funcionario1.toString());
    }
}