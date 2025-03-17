package exercicio04;

import java.util.Scanner;

public class MainVeiculoLivro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a placa do veículo: ");
        String placaDoCarro = ler.next();
        System.out.println("Digite a cor do veículo: ");
        String corDoCarro = ler.next();
        System.out.println("Digite o número de passageiros do veículo: ");
        int nmrDePassageiros = ler.nextInt();
        System.out.println("Digite a capacidade do tanque do veículo: ");
        double cpcdDeTanque = ler.nextDouble();
        System.out.println("Digite a velocidade máxima do veículo: ");
        int vlcddMaxima = ler.nextInt();
        System.out.println("Digite o consumo medio do veículo: ");
        double csmMedio = ler.nextDouble();

        Veiculo veiculo = new Veiculo(placaDoCarro, corDoCarro, nmrDePassageiros, cpcdDeTanque, vlcddMaxima, csmMedio);
        
        System.out.println("\nDigite o titulo do livro: ");
        String tituloDoLivro = ler.next();
        System.out.println("Digite o nome do autor: ");
        String autorDoLivro = ler.next();
        System.out.println("ISBN do livro: ");
        int isbnDoLivro = ler.nextInt();
        System.out.println("Digite o número de páginas: ");
        int numeroDePaginaDoLivro = ler.nextInt();
        System.out.println("Digite o valor da compra do livro: ");
        double valorDeCompraDoLivro = ler.nextDouble();
        
        Livro livro = new Livro(tituloDoLivro, autorDoLivro, isbnDoLivro, numeroDePaginaDoLivro, valorDeCompraDoLivro);
        
        System.out.println("\nPlaca do caro: " + veiculo.getPlaca());
        System.out.println("Cor do carro: " + veiculo.getCor());
        System.out.println("Número de passageiros: " + veiculo.getNumeroDePassageiros());
        System.out.println("Capacidade de Tanque: " + veiculo.getCapacidadeDeTanque());
        System.out.println("Velocidade máxima: " + veiculo.getVelocidadeMaxima());
        System.out.println("Consuom medio: " + veiculo.getConsumoMedio());

        System.out.println("\nTítulo do livro: " + livro.getTitulo());
        System.out.println("Autor do livro: " + livro.getAutor());
        System.out.println("ISBN do livro: " + livro.getIsbn());
        System.out.println("Número de páginas do livro: " + livro.getNumeroDePaginas());
        System.out.println("Valor de compra: " + livro.getValorDeCompra());

        ler.close();
    }
}
