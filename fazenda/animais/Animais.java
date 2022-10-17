package animais;

public abstract class Animais {
    String name;

    public Animais(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String animalEat();
}
