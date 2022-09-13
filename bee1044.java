import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		final Scanner input = new Scanner(System.in);

		int A;
		int B;

		A = input.nextInt();
		B = input.nextInt();

        input.close();

		if ((A % B == 0) || (B % A == 0)) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}
}