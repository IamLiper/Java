package exercicio09;

public class MainFuncionario {
    public static void main(String[] args) {
    
    Funcionario funcionario = new Funcionario("18", "Lipe", 11500.50, Setor.FINANCEIRO, Sexo.MASCULINO, "18");

    System.out.println(funcionario.toString());
    }
}
