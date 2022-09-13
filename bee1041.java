/*

	qual quadrante (q1, q2, q3, q3)
		q1 = +x +y
		q2 = -x +y
		q3 = -x -y'
		q4 = +x -y
	sobre eixo
	origem

*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		final Scanner input = new Scanner(System.in);


		double axisX;
		double axisY;

		axisX = input.nextDouble();
		axisY = input.nextDouble();

        input.close();

		if((axisX == 0) && (axisY == 0)) {
			System.out.println("Origem");
		}

		if (axisY > 0) {
			if (axisX > 0) {
				System.out.println("Q1");
			} else if (axisX < 0) {
				System.out.println("Q2");
			}
		}

		if (axisY < 0) {
			if (axisX > 0) {
				System.out.println("Q4");
			} else if (axisX < 0){
				System.out.println("Q3");
			} 
		}

		if ((axisY == 0) || (axisX == 0)) {
			if ((axisX > 0) || (axisX < 0)){
				System.out.println("Eixo X");
			}

			if ((axisY > 0) || (axisY < 0)){
				System.out.println("Eixo Y");
			}
		}
	}
}
