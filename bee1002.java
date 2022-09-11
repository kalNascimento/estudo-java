import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio = 0;
        double area = 0;
        double n = 3.14159;
        
        raio = input.nextDouble();

        area = n * (raio * raio);
        
        System.out.printf("A=%.4f%n", area);

        input.close();
    }
}