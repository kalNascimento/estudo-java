package animais;

public abstract class Animal implements Talkers {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void talk();

}
