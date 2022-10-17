import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		String name;
		double fixedSalary;
		double saleAmount;
		double salary;

		name = "";
		fixedSalary = 0;
		saleAmount = 0;
		salary = 0;

		name = input.nextLine();
		fixedSalary = input.nextDouble();
		saleAmount  = input.nextDouble();

		input.close();
		
		salary = fixedSalary + (saleAmount * 0.15);

		System.out.printf("TOTAL = R$ %.2f%n", salary);
	}
}