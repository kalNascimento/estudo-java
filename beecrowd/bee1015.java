import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		double x1;
		double y1;
		double x2;
		double y2;

		double prodX;
		double prodY;
		double calcFinal;

		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();

		input.close();

		prodX = Math.pow((x2 - x1), 2);
		prodY = Math.pow((y2 - y1), 2);

		calcFinal = Math.sqrt((prodX + prodY));
		
		System.out.printf("%.4f\n",calcFinal);
	}
}