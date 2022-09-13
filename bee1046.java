import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		final Scanner input = new Scanner(System.in);

		int inicio;
		int fim;
		int diff;

		inicio = input.nextInt();
		fim = input.nextInt();
		
		if(inicio == fim) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else if (inicio < fim ){
			diff = Math.abs(inicio - fim);
			System.out.println("O JOGO DUROU " + diff + " HORA(S)");
		} else {
			diff = (24 + fim) - inicio;
			System.out.println("O JOGO DUROU " + diff + " HORA(S)");
		}
	}
}