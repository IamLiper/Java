package exercicio14;

public class MainCalculo {
    public static void main(String[] args) {
        Soma soma1 = new Soma();
        Subtracao subtracao1 = new Subtracao();
        Multiplicacao multiplicacao1 = new Multiplicacao();
        Divisao divisao1 = new Divisao();

        System.out.println("Soma: " + soma1.calcular(5, 10));
        System.out.println("Subtração: " + subtracao1.calcular(5, 2));
        System.out.println("Multiplicação: " + multiplicacao1.calcular(5, 5));
        System.out.println("Divisão: " + divisao1.calcular(5, 2.5));
    }
}