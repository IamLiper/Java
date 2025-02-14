package exercicio02;

import java.util.Scanner;

import exercicio02.models.Pets;

public class MainPets {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o titulo do livro: ");
        String nomeDoPet = ler.nextLine();
        System.out.println("Digite o nome do autor do livro: ");
        int idadeDoPet = ler.nextInt();
        System.out.println("Digite o número de páginas do livro: ");
        String racaDoPet = ler.nextLine();
        System.out.println("Digite o preço do livro: ");
        String porteDoPet = ler.nextLine();
        System.out.println("Digite o preço do livro: ");
        String alimetacaoDoPet = ler.nextLine();

        Pets pet1 = new Pets(nomeDoPet, idadeDoPet, racaDoPet, porteDoPet, alimetacaoDoPet);

        System.out.println("Nome do pet: " + pet1.getNome());
        System.out.println("Idade do pet: " + pet1.getIdade());
        System.out.println("Raça do pet: " + pet1.getRaca());
        System.out.println("Porte do pet: " + pet1.getPorte());
        System.out.println("Alimentação do pet: " + pet1.getAlimentacao());
        
        // Pet 2
        
        // System.out.println("Digite o titulo do livro: ");
        // nomeDoPet = ler.nextLine();
        // System.out.println("Digite o nome do autor do livro: ");
        // idadeDoPet = ler.nextInt();
        // System.out.println("Digite o número de páginas do livro: ");
        //  racaDoPet = ler.nextLine();
        // System.out.println("Digite o preço do livro: ");
        // porteDoPet = ler.nextLine();
        // System.out.println("Digite o preço do livro: ");
        // alimetacaoDoPet = ler.nextLine();

        // Pets pet2 = new Pets(nomeDoPet, idadeDoPet, racaDoPet, porteDoPet, alimetacaoDoPet);

        // System.out.println("Nome do pet: " + pet2.getNome());
        // System.out.println("Idade do pet: " + pet2.getIdade());
        // System.out.println("Raça do pet: " + pet2.getRaca());
        // System.out.println("Porte do pet: " + pet2.getPorte());
        // System.out.println("Alimentação do pet: " + pet2.getAlimentacao());

        ler.close();
    }
}
