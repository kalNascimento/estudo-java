import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		final Scanner input = new Scanner(System.in);

		int[] disorderedNumbers = new int[3];
		int[] readNumbers = new int[3];

		disorderedNumbers[0] = input.nextInt();
		disorderedNumbers[1] = input.nextInt();
		disorderedNumbers[2] = input.nextInt();
		input.close();

		readNumbers[0] = disorderedNumbers[0];
		readNumbers[1] = disorderedNumbers[1];
		readNumbers[2] = disorderedNumbers[2];
		
		Arrays.sort(disorderedNumbers);
		
		System.out.println(disorderedNumbers[0]);
		System.out.println(disorderedNumbers[1]);
		System.out.println(disorderedNumbers[2]);
		System.out.println("");
		System.out.println(readNumbers[0]);
		System.out.println(readNumbers[1]);
		System.out.println(readNumbers[2]);
	}
}