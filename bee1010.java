import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] arg) throws IOException{
		Scanner input = new Scanner(System.in);

		int codPart1;
		int amountPart1;
		double pricePart1;
		
		int codPart2;
		int amountPart2;
		double pricePart2;

		double soma;

		codPart1 = input.nextInt();
		amountPart1 = input.nextInt();
		pricePart1 = input.nextDouble();
		
		codPart2 = input.nextInt();
		amountPart2 = input.nextInt();
		pricePart2 = input.nextDouble();

		input.close();

		soma = (amountPart1 * pricePart1) + (amountPart2 * pricePart2);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);
	}
}