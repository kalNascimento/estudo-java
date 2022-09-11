import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String arg[]) throws IOException {
        Scanner input = new Scanner(System.in);

        int valor1;
        int valor2;
        int PROD;

        valor1 = 0;
        valor2 = 0;
        PROD = 0;

        valor1 = input.nextInt();
        valor2 = input.nextInt();

        PROD = valor1 * valor2;

        System.out.println("PROD = " + PROD);
    }
}