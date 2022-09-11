import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] arg) throws IOException {
		Scanner input = new Scanner(System.in);

		double A;
		double B;
		double C;
		double triangle;
		double circle;
		double trapeze;
		double square;
		double rectangle;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		triangle = (A * C)/2;
		circle =  3.14159 * C * C;
		trapeze = ((A + B)*C)/2;
		square = B * B;
		rectangle = A * B;

		System.out.printf("TRIANGULO: %.3f\n", triangle);
		System.out.printf("CIRCULO: %.3f\n", circle);
		System.out.printf("TRAPEZIO: %.3f\n", trapeze);
		System.out.printf("QUADRADO: %.3f\n", square);
		System.out.printf("RETANGULO: %.3f\n", rectangle);
	}
}