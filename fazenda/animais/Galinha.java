package animais;

public class Galinha extends Animais {
    String color;

    public Galinha(String name, String color) {
        super(name);
        this.color = color;
    }
    
    public String animalEat() {
        return "milho ai q dilicia";
    }
}
