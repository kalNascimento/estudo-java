/*

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		final Scanner input = new Scanner(System.in);

		double A;
		double B;
		double C;
		double memoria;

		double powA;
		double powB;
		double powC;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble(); 

		if (B > A && B > C) {
			memoria = A;
			A = B;
			B = memoria;
		} else if (C > A) {
			memoria = A;
			A = C;
			C = memoria;
		}
		
		powA = Math.pow(A, 2);
		powB = Math.pow(B, 2);
		powC = Math.pow(C, 2);

		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (powA == (powB + powC)) {
			System.out.println("TRIANGULO RETANGULO");
			}
	
			if (powA > (powB + powC)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
	
			if (powA < (powB + powC)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
	
			if ((A == B) && (B == C)) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if ((A == B) || (B == C) || (A == C)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
	}
}