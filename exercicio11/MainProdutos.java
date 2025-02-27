package exercicio11;

public class MainProdutos {
    public static void main(String[] args) {
        Camisa camisa1 = new Camisa("Nike", "Preto", "M", 150);
        Calca calca1 = new Calca("Adidas", "Jeans", "48", 120);
        Sapato sapato1 = new Sapato("Polo", "Preto", "39-40", 99.99);

        System.out.println(camisa1.toString());
        System.out.println(calca1.toString());
        System.out.println(sapato1.toString());
    }
}
