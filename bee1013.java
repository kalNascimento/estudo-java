import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int A;
		int B;
		int C;

		int maiorAB;
		int maiorFinal;

		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();

		maiorAB = ((A + B + Math.abs((A - B)))/2);
		maiorFinal = ((C + maiorAB + Math.abs((C - maiorAB)))/2);

		System.out.println(maiorFinal + " eh o maior");
		
	}
}