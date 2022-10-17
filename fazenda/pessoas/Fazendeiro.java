package pessoas;

public class Fazendeiro extends Pessoas{
    
    public Fazendeiro(String name, int age, String function) {
        super(name, age, function);
    }

    public String fazendando(String animals) {
        return "Cuidando dos(as)" + animals;
    }
}
