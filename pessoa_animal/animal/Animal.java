package animal;

public class Animal {
    private String name;

    public Animal(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name = name;
    }

    public String eatFood(String food) {
        return String.format("Ai q delicia de %s", food);
    }
}
