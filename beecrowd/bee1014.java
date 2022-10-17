import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int X;
		double Y;
		double consumo;

		X = input.nextInt();
		Y = input.nextDouble();

		input.close();
		
		consumo = X / Y;
		
		System.out.printf("%.3f", consumo);
		System.out.println(" km/l");
	}
}