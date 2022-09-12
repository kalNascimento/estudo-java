import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		double A;
		double B;
		double C;
		double delta;
		double raiz1;
		double raiz2;

		A = input.nextDouble();	
		B = input.nextDouble();
		C = input.nextDouble();

		delta = Math.pow(B, 2) - (4*A*C);

		raiz1 = (-B + Math.sqrt(delta))/(2*A);
		raiz2 = (-B - Math.sqrt(delta))/(2*A);

		if ((delta < 0) || ((2*A) == 0)){
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f\n", raiz1);
			System.out.printf("R2 = %.5f\n", raiz2);
		}
	}
}