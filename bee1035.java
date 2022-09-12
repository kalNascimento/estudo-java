/*
	B > C && D > A 
	&& 
	(C + D) > (A + B) && (A % 2) == 0
	&&
	C > 0 && D > 0
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int A;
		int B;
		int C;
		int D;

		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();

		input.close();

		if ((B > C) && (D > A)){
			if (((C + D) > (A + B)) && ((A % 2) == 0)) {
				if ((C > 0) && (D > 0)) {
					System.out.println("Valores aceitos");
				} else {
					System.out.println("Valores nao aceitos");
				}
			} else {
				System.out.println("Valores nao aceitos");
			}
		} else {
			System.out.println("Valores nao aceitos");
		}
	}
}