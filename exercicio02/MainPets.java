package exercicio02;

import java.util.Scanner;

import exercicio02.models.Pets;

public class MainPets {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do pet: ");
        String nomeDoPet = ler.next();
        System.out.println("Digite a idade do pet: ");
        int idadeDoPet = ler.nextInt();
        System.out.println("Digite a raça do pet: ");
        String racaDoPet = ler.next();
        System.out.println("Digite o porte do pet: ");
        String porteDoPet = ler.next();
        System.out.println("Digite a alimentação do pet: ");
        String alimetacaoDoPet = ler.next();

        Pets pet1 = new Pets(nomeDoPet, idadeDoPet, racaDoPet, porteDoPet, alimetacaoDoPet);

        System.out.println("\nNome do pet: " + pet1.getNome());
        System.out.println("Idade do pet: " + pet1.getIdade());
        System.out.println("Raça do pet: " + pet1.getRaca());
        System.out.println("Porte do pet: " + pet1.getPorte());
        System.out.println("Alimentação do pet: " + pet1.getAlimentacao());
        
        // Pet 2
        
        System.out.println("\nDigite o nome do pet: ");
        nomeDoPet = ler.next();
        System.out.println("Digite a idade do pet: ");
        idadeDoPet = ler.nextInt();
        System.out.println("Digite a raça do pet: ");
        racaDoPet = ler.next();
        System.out.println("Digite o porte do pet: ");
        porteDoPet = ler.next();
        System.out.println("Digite a alimentação do pet: ");
        alimetacaoDoPet = ler.next();

        Pets pet2 = new Pets(nomeDoPet, idadeDoPet, racaDoPet, porteDoPet, alimetacaoDoPet);

        System.out.println("\nNome do pet: " + pet2.getNome());
        System.out.println("Idade do pet: " + pet2.getIdade());
        System.out.println("Raça do pet: " + pet2.getRaca());
        System.out.println("Porte do pet: " + pet2.getPorte());
        System.out.println("Alimentação do pet: " + pet2.getAlimentacao());

        ler.close();
    }
}
