import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main (String[] arg) throws IOException {
		Scanner input = new Scanner(System.in);

		double A;
		double B;
		double media;

		A = 0;
		B = 0;
		media = 0;

		A = input.nextDouble();
		B = input.nextDouble();

		media = (((A*3.5) + (B*7.5))/11);

		System.out.printf("Media = %.5f%n", media);
	}
}