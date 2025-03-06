public class MainAnimal {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();
        Galo galo1 = new Galo();
        Pato pato1 = new Pato();

        System.out.println("Cachorro\nSom: " + cachorro1.emitirSom() + "\nComida: " + cachorro1.comer() + "\nAção: " + cachorro1.acao());
        System.out.println("Gato\nSom: " + gato1.emitirSom() + "\nComida: " + gato1.comer() + "\nAção: " + gato1.acao());
        System.out.println("Galo\nSom: " + galo1.emitirSom() + "\nComida: " + galo1.comer() + "\nAção: " + galo1.acao());
        System.out.println("Pato\nSom: " + pato1.emitirSom() + "\nComida: " + pato1.comer() + "\nAção: " + pato1.acao());
    }
}