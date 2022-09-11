import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] arg) throws IOException {
		Scanner input = new Scanner(System.in);

		int codFuncionario;
		int horasTrabalhadas;
		double valorHora;
		double salario;

		codFuncionario = 0;
		horasTrabalhadas = 0;
		valorHora = 0;
		salario = 0;

		codFuncionario = input.nextInt();
		horasTrabalhadas = input.nextInt();
		valorHora = input.nextDouble();

		salario = valorHora * horasTrabalhadas;

		System.out.println("NUMBER = " + codFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
	}
}