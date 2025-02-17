package exercicio04;

import java.util.Scanner;

import exercicio04.models.Veiculo;
import exercicio04.models.Cliente;

public class MainVeiculoCliente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a placa do veículo: ");
        String placaDoCarro = ler.next();
        System.out.println("Digite a cor do veículo: ");
        String corDoCarro = ler.next();
        System.out.println("Digite o número de passageiros do veículo: ");
        int nmrDePassageiros = ler.nextInt();
        System.out.println("Digite a quantidade do tanque de gasolina do veículo: ");
        double cpcdDeTanque = ler.nextDouble();
        System.out.println("Digite a velocidade máxima do veículo: ");
        int vlcddMaxima = ler.nextInt();
        System.out.println("Digite a porcentagem de consumo medio do veículo: ");
        double csmMedio = ler.nextDouble();
        
        double pctgDeConsumo = csmMedio;
        double qtddDotanque = cpcdDeTanque;

        double consumoTotal = qtddDotanque - (qtddDotanque * (pctgDeConsumo/100));



        Veiculo veiculo = new Veiculo(placaDoCarro, corDoCarro, nmrDePassageiros, cpcdDeTanque, vlcddMaxima, csmMedio);

        System.out.println("\nDigite o nome do cliente: ");
        String nomeDoCliente = ler.next();
        System.out.println("Digite a idade do cliente: ");
        int idadeDoCliente = ler.nextInt();
        System.out.println("Digite o CPF do cliente: ");
        String cpfDoCliente = ler.next();
        System.out.println("Digite o endereço do cliente: ");
        String enderecoDoCliente = ler.next();
        System.out.println("Digite o telefone do cliente: ");
        int telefonedoCliente = ler.nextInt();

        Cliente cliente = new Cliente(nomeDoCliente, idadeDoCliente, cpfDoCliente, enderecoDoCliente, telefonedoCliente);


        System.out.println("\nPlaca do caro: " + veiculo.getPlaca());
        System.out.println("Cor do carro: " + veiculo.getCor());
        System.out.println("Número de passageiros: " + veiculo.getNumeroDePassageiros());
        System.out.println("Capacidade de Tanque: " + veiculo.getCapacidadeDeTanque());
        System.out.println("Velocidade máxima: " + veiculo.getVelocidadeMaxima());
        System.out.println("Consuom medio: " + veiculo.getConsumoMedio());
        System.out.println("Consumo total de gasolina: " + consumoTotal);

        System.out.println("\nNome do Cliente: " + cliente.getNome());
        System.out.println("Idade do cliente: " + cliente.getIdade());
        System.out.println("CPF do cliente: " + cliente.getCpf());
        System.out.println("Endereço do cliente: " + cliente.getEndereco());
        System.out.println("Telefone do cliente: " + cliente.getTelefone());
        
        ler.close();
    }
}