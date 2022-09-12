import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A = 0;
        int B = 0;
        int SOMA = 0;
        
        A = input.nextInt();
        B = input.nextInt();

        input.close();

        SOMA = A + B;
        
        System.out.printf("SOMA = %d\n", SOMA);

        input.close();
    }
}