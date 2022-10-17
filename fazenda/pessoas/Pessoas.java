package pessoas;

public class Pessoas {
    String name;
    int age;
    String function;

    public Pessoas(String name, int age, String function) {
        setName(name);
        setAge(age);
        setFunction(function);
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getFunction() {
        return function;
    }
}
