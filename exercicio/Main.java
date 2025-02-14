package exercicio;

import java.util.Scanner;

import exercicio.models.Livro;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o titulo do livro: ");
        String nomeDoLivro = ler.next();
        System.out.println("Digite o nome do autor do livro: ");
        String nomeDoAutor = ler.next();
        System.out.println("Digite o número de páginas do livro: ");
        int numeroDaPagina = ler.nextInt();
        System.out.println("Digite o preço do livro: ");
        double precoDoLivro = ler.nextDouble();

        Livro livro1 = new Livro(nomeDoLivro, nomeDoAutor, numeroDaPagina, precoDoLivro);

        System.out.println("\nTítulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Número de páginas: " + livro1.getNumeroDePaginas());
        System.out.println("Preço: " + livro1.getPreco());

        // Livro 2

        System.out.println("\nDigite o titulo do livro: ");
        nomeDoLivro = ler.nextLine();
        System.out.println("Digite o nome do autor do livro: ");
        nomeDoAutor = ler.nextLine();
        System.out.println("Digite o número de páginas do livro: ");
        numeroDaPagina = ler.nextInt();
        System.out.println("Digite o preço do livro: ");
        precoDoLivro = ler.nextDouble();

        Livro livro2 = new Livro(nomeDoLivro, nomeDoAutor, numeroDaPagina, precoDoLivro);

        System.out.println("\nTítulo: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Número de páginas: " + livro2.getNumeroDePaginas());
        System.out.println("Preço: " + livro2.getPreco());

        ler.close();
    }

}
