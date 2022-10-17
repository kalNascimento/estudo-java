import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] arg) throws IOException {
		Scanner input = new Scanner(System.in);

		double A;
		double B;
		double C;
		double media;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		input.close();

		media = ((A*2) + (B*3) + (C*5))/10;

		System.out.printf("MEDIA = %.1f%n", media);
	}
}