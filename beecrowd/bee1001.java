import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
    
        int A = 0;
        int B = 0;
        int X = 0;
        
        A = input.nextInt();
        B = input.nextInt();
        
        input.close();
    
        X = A + B;
        
        System.out.printf("X = %d\n", X);
    }
}