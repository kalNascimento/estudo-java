import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] arg) throws IOException {
		Scanner input = new Scanner(System.in);

		int A;
		int B;
		int C;
		int D;
		int diferenca;
		
		A = 0;
		B = 0;
		C = 0;
		D = 0;

		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();

		diferenca = ((A*B) - (C * D));
		
		System.out.println("DIFERENCA = " + diferenca);
	}
}