public class MainRPG {
    public static void main(String[] args) {

    Status status = new Status();
    Personagem personagem1 = new Personagem("Lipe", Sexo.MASCULINO, Classe.ASSASSIN, status);

    System.out.println(personagem1.toString());
    }
}