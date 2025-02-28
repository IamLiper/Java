package exercicio13;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();
        Galo galo1 = new Galo();
        Pato pato1 = new Pato();

        System.out.println("Cachorro: Som: " + cachorro1.emitirSom() + "| Comida: " + cachorro1.comer());
        System.out.println("Gato: Som: " + gato1.emitirSom() + "| Comida: " + gato1.comer());
        System.out.println("Galo: Som: " + galo1.emitirSom() + "| Comida: " + galo1.comer());
        System.out.println("Pato: Som: " + pato1.emitirSom() + "| Comida: " + pato1.comer());
    }
}