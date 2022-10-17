/*

| b - c | < a < b + c
| a - c | < b < a + c
| a - b | < c < a + b

*/


import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		final Scanner input = new Scanner(System.in);

		double A;
		double B;
		double C;
		double perimetro;
		double area;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

        input.close();

		if(isTriangle(A, B, C)) {
			perimetro = A + B + C;
			System.out.printf("Perimetro = %.1f\n", perimetro);
		}
		
		if(!isTriangle(A, B, C)) {
			area = ((A + B)*C)/2;
			System.out.printf("Area = %.1f\n", area);
		}
		
	}

	public static boolean isTriangle(double A, double B, double C) {
		boolean response = false;
		
		if (Math.abs((B - C)) < A) {
			if (A < (B + C)) {
				response =  true;
			}
		}
		
		if (Math.abs((A - C)) < B) {
			if (B < (A + C)) {
				response = true;
			}
		}
		
		if (Math.abs((A - B)) < C) {
			if (C < (A + B)) {
				response = true;
			}
		}

		return response;
	}
}