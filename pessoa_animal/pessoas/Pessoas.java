package pessoas;

public class Pessoas {
    private String name;

    public Pessoas(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name = name;
    }

    public String sayName() {
        return String.format("My name is %s, nice too meet u", this.name);
    }
}

    