package exercicio08;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lipe", Sexo.MASCULINO);

        System.out.println(pessoa.toString());
    }
}