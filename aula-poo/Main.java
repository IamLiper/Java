import models.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Anne", 26, "anne@gmail.com");

        pessoa.setNome("Lipee");
        pessoa.setIdade(18);
        pessoa.setEmail("Lipe@Email.com");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Email: " + pessoa.getEmail());
    }
}