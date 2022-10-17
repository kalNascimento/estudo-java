import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] arg) throws IOException {
		Scanner input = new Scanner(System.in);

		double R;
		double pi;
		double vol;

		R = input.nextDouble();

		input.close();
		
		pi = 3.14159;

		vol = (4.0/3.0) * pi * R * R * R; // colocar a divisão inicial em decimais cñ o retorno vai ser um inteiro

		System.out.printf("VOLUME = %.3f\n", vol);
	}
}