package animais;

public class Chicken extends Animal implements Flyers{

    public Chicken(String name) {
        super(name);
    }

    public void talk() {
        System.out.println("Iam talking bro???");
    }

    public void fly() {
        System.out.println("Iam flying bro???");
    }
}
