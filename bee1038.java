import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		double codPrice[] = new double[5];
		double pag;
		int cod;
		int amount;
		
		codPrice[0] = 4.00;
		codPrice[1] = 4.50;
		codPrice[2] = 5.00;
		codPrice[3] = 2.00;
		codPrice[4] = 1.50;

		cod = input.nextInt() - 1;
		amount = input.nextInt();

		input.close();

		pag = codPrice[cod] * amount;

		System.out.printf("Total: R$ %.2f\n", pag);
	}
}