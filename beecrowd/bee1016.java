import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[]  args) throws IOException {
		Scanner input = new Scanner(System.in);

		int carY;
		int time;
		
		carY = input.nextInt();

		input.close();

		time = carY * 2;

		System.out.printf("%d",time);
		System.out.println(" minutos");
	}
}