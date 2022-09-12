/*

	Intervalo
		*0 - *25
		 25 - *50
		 50 - *75
		 75 - *100

*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		double interval;

		interval = input.nextDouble();
        
        input.close();

		if ((interval < 0) || (interval > 100)) System.out.println("Fora de intervalo");		
		if ((interval >= 0) && (interval <= 25)) System.out.println("Intervalo [0,25]");
		if ((interval > 25) && (interval <= 50)) System.out.println("Intervalo (25,50]");		
		if ((interval > 50) && (interval <= 75)) System.out.println("Intervalo (50,75]");
		if ((interval > 75) && (interval <= 100)) System.out.println("Intervalo (75,100]");		
		
	}
}