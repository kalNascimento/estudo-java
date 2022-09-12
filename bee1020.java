import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int daysLiving;
		int years;
		int months;
		int days;

		years = 0;
		months = 0;
		days = 0;

		daysLiving = input.nextInt();

		input.close();

		while(daysLiving >= 365) {
			daysLiving = daysLiving - 365;
			years++;
		}

		while(daysLiving >= 30) {
			daysLiving = daysLiving - 30;
			months++;
		}

		days = daysLiving;

		System.out.println(years + 	" ano(s)");
		System.out.println(months + " mes(es)");
		System.out.println(days + 	" dia(s)");
	}
}