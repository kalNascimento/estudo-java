import pessoas.Pessoas;
import animal.Animal;

public class Main {

    public static void main(String[] args) {
        Pessoas serHumano = new Pessoas("kalebe");
        Animal galinha = new Animal("Josefina");

        System.out.println(serHumano.getName());
        System.out.println(serHumano.sayName());

        System.out.println(galinha.getName());
        System.out.println(galinha.eatFood("milho"));
    }
}