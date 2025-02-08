import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] listaDeNotas = new double[3];
        double soma = 0;
        double media;
        int qntnota = 0;

        for (int i = 0; i < listaDeNotas.length; i++) {
            System.out.println("Digite a " + (i+1) + "ª nota: \n");
            listaDeNotas[i] = ler.nextDouble();
            soma += listaDeNotas[i];
            qntnota += 1;
        }

        media = soma / qntnota;

        for (double nota : listaDeNotas) {
            System.out.println("Nota: " + nota);
        }

            System.out.println("Media: " + media);
    }
}
