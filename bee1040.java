import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		final Scanner input = new Scanner(System.in);

		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double notaExame;
		double mediaIntermediaria;
		double mediaFinal;

		nota1 = input.nextDouble();
		nota2 = input.nextDouble();
		nota3 = input.nextDouble();
		nota4 = input.nextDouble();

		mediaIntermediaria = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1))/10;

		if (mediaIntermediaria < 5) {
			double men;
			men = Math.floor(mediaIntermediaria);
			mediaFinal = mediaIntermediaria - Math.floor(mediaIntermediaria);
			mediaFinal = Math.floor((mediaFinal * 10));
			mediaFinal = men + (mediaFinal / 10);
			System.out.printf("Media: %.1f\n", mediaFinal);
			System.out.println("Aluno reprovado.");
		}
		if (mediaIntermediaria >= 7) {
			mediaFinal = mediaIntermediaria;
			System.out.printf("Media: %.1f\n", mediaFinal);
			System.out.println("Aluno aprovado.");
		}
		if ((mediaIntermediaria >= 5) && (mediaIntermediaria <= 6.9)) {
			notaExame = input.nextDouble();
			mediaFinal = (mediaIntermediaria + notaExame)/2;

			System.out.printf("Media: %.1f\n", mediaIntermediaria);
			System.out.println("Aluno em exame.");
			System.out.printf("Nota do exame: %.1f\n", notaExame);
			if (mediaFinal >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", mediaFinal);
		}
	}
}