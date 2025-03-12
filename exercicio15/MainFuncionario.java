package exercicio15;

public class MainFuncionario {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("João", "123.456.789-00", "01/01/1990", 1000.0, "ABC-1234");
        Gerente gerente = new Gerente("Maria", "987.654.321-00", "01/01/1980", 5000.0, Bonificacao.GERENTE);
        
        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());

        gerente.admitir(motoboy);
    }
}