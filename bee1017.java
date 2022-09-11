import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int tempoGasto;
		int velocidadeMedia;
		double distancia;
		double gastoCombustivel;

		tempoGasto = input.nextInt();
		velocidadeMedia = input.nextInt();

		distancia = tempoGasto * velocidadeMedia;
		gastoCombustivel = distancia / 12;

		System.out.printf("%.3f\n", gastoCombustivel);
	}
}