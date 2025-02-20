package exercicio07;

public class MainBancoFunc {
    public static void main(String[] args) {
        ContaBanc contaBanc = new ContaBanc("Itaú", "1984", "18", "poupança", 3000, 10000);
        Funcionario funcionario = new Funcionario("11", "Lipe", "rua da palma", "7874838434", "bvhvb@gmail.com", contaBanc);

        System.out.println(funcionario.toString());
    }
}